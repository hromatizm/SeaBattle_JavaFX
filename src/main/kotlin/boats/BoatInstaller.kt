package boats

import com.example.seafx.SeaController
import coordinates.GetCoord
import fields.TechField4Algorithm
import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

// Расстановщик кораблей на поле
class BoatInstaller(private val factory: BoatFactory, private val isHuman: Boolean) {
    @FXML
    private lateinit var boatInstallLabel: Label
    val techField = factory.techField


    // Приглашение поставить корабль:
    fun printWelcome(size: Int, num: Int, label: Label?) {

        boatInstallLabel = label!!
        val boatNumber = when {
            size < 4 -> "$num-й "
            else -> ""
        }

        boatInstallLabel.text = ("Поставим $boatNumber $size-палубный...")
        println("printWelcome")
    }

    fun printError() {
        println("Не корректные координаты")
    }

    // Установка одного корабля. Принимает в качесвте параметра только id корабля
    suspend fun install(id: Int, label: Label?): Pair<Boolean, Boat> {
        println("install")
        val size = id / 10 // Размер корабля - первая цифра id
        val num = id - size * 10 // Номер корабля данного размера - вторая цифра id
        var boat: Boat
        var testCount = 0
        do {

            testCount++
            if (isHuman) {
                MainScope().launch {
                    printWelcome(size, num, label)
                }
//                withContext(Dispatchers.Main) {
//
//                }
            } // Сообщение с приглашением поставить корабль
            val readPair = if (isHuman) GetCoord().boatHuman(id) else GetCoord().boatRobot() // Считываем пару
            println("Coord is read")
            val coordBegin = readPair.first // Первый элемент пары - начальная координата корабля
            val isVertical = readPair.second // Второй элемент пары - признак вертикальности
            boat = factory.makeBoat(id, coordBegin, isVertical) // Через фабрику делаем корабль

            if (isHuman && !testBoat(boat))
                printError()
            if (techField.boatList.size > 0 && testCount > 100) {
                println("Ups!!")
                return false to boat
            }
        } while (!testBoat(boat)) // Проверка - может ли корабль с такими координатами корректно стоять на поле.
        // Если проверка пройдена, то ставим его на поле:
        with(techField) {  // На ТехПоле
            boatList[boat.id] = boat // Добавлем в коллекцию кораблей
            update() // Обновляем ТехПоле
            aliveBoatCounter++ // Инкремент счетчика кораблей
        }
        for (coord in boat.coordinates) {
            SeaController.seaButtonMap.getValue(coord!!.id).background =
                Background(BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY))
        }

        return true to boat
    }

    // Принимает список id кораблей для установки:
    suspend fun installAllHuman(boatsIdToInstall: Collection<Int>, label: Label) { // Установка всех нужных кораблей:
        println("installAll")
        for (id in boatsIdToInstall) {
            install(id, label)
        }
        SeaController.humanBoatCoordGetter = null

        MainScope().launch {
            boatInstallLabel.text = "Готово!"
        }
        techField.print()
    }

    suspend fun installAllRobot(boatsIdToInstall: Collection<Int>) { // Установка всех нужных кораблей:
        for (id in boatsIdToInstall) {
            install(id, null)
            techField.uiInstaller.print() // Выводим UI поле в консоль
        }

    }

    // Проверка - может ли корабль с такими координатами корректно стоять на поле:
    fun testBoat(boat: Boat): Boolean {
        if (boat.coordEnd.letter > 10 || boat.coordEnd.number > 10) { // Последняя координата не больше 10
            return false
        }

        if (techField !is TechField4Algorithm && techField.boatList.isEmpty()) // Если ставиться первый корабль, то ОК.
            return true

        for (coord in boat.coordinates) {  // Координаты корбля
            for (boatOnField in techField.boatList) { // Уже стоящие корабли
                // Сравниваем координаты корабля с координатами поставленных кораблей:
                for (coordBF in boatOnField.value.coordinates) {
                    if (coord == coordBF)
                        return false
                }
                // Сравниваем координаты корабля с координатами рамок поставленных кораблей:
                for (coordFrame in boatOnField.value.frame) {
                    if (coord == coordFrame)
                        return false
                }
            }
            // Сравниваем координаты корабля с координатами сбитых кораблей:
            for (coordScored in techField.scoredList) {
                if (coord == coordScored) {
                    return false
                }
            }
            // Сравниваем координаты корабля с координатами "мимо"
            for (coordFail in techField.failList) {
                if (coord == coordFail) {
                    return false
                }
            }
        }
        return true
    }
}