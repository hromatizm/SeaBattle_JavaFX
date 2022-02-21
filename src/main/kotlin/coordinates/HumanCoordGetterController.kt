package coordinates

import Cell.*
import Cell.HumanButton
import boats.Boat
import com.example.seafx.Model
import com.example.seafx.SeaController
import javafx.event.EventHandler
import javafx.scene.input.MouseEvent
import javafx.scene.paint.Color
import javafx.scene.shape.Circle

open class HumanCoordGetterController() : SeaController() {
    var handlerMouseEnter4Install: EventHandler<MouseEvent>? = EventHandler<MouseEvent> { event ->
        if (event?.source is HumanButton) {
            val button = event.source as HumanButton
            boatTemp.coordBegin = button.coord
            boatTemp.coordinates[0] = boatTemp.coordBegin
            // Если размер корабля больше чем 1, то добавляем в коллекцию остальные координаты:
            if (boatTemp.size > 1) {
                for (i in 1 until boatTemp.size) {
                    val last = boatTemp.coordinates[i - 1] // Берем последнюю координату из коллекции
                    val new = when { // На ее основе создаем новую
                        isVertical -> Coordinate(last.letter, last.number + 1)
                        else -> Coordinate(last.letter + 1, last.number)
                    }
                    boatTemp.coordinates[i] = (new)
                }
            }
            boatTemp.coordEnd = boatTemp.coordinates[boatTemp.size - 1]

            for (button in HumanButton.buttonMap.values) {
                if (!boatTemp.coordinates.any { it in Model.humanTechField.boatsAndFramesCoordsList })
                    for (coord in boatTemp.coordinates)
                        if (coord.id == button.id) {
                            button.style = "-fx-padding: 0.0 0.0 0.0 0.0"
                            button.graphic = when {
                                boatTemp.coordEnd.letter > 10 || boatTemp.coordEnd.number > 10 ->
                                    Circle(0.0)
                                else -> Circle(12.0, Color.BLUE)
                            }
                        }
            }
        }
    }
    var handlerMouseExit4Install: EventHandler<MouseEvent>? = EventHandler<MouseEvent> { event ->
        if (event?.source is HumanButton) {

            HumanButton.buttonMap.values.filter { it.coord in boatTemp.coordinates }
                .forEach { it.graphic = Circle(0.0) }
        }
    }
    var handlerMouseClick4Install: EventHandler<MouseEvent>? = EventHandler<MouseEvent> { event ->
        if (event?.source is HumanButton) {
            val button = event.source as HumanButton
            if (boatTemp.coordEnd.letter <= 10 && boatTemp.coordEnd.number <= 10)
                GetCoord.newCoordForInstall = button.coord

            HumanButton.buttonMap.values.filter { it.coord in boatTemp.coordinates }
                .forEach { it.graphic = Circle(0.0) }
        }
    }

    var handlerMouseClick4Turn: EventHandler<MouseEvent>? = EventHandler<MouseEvent> { event ->
        if (event?.source is RobotButton) {
            val button = event.source as RobotButton
            GetCoord.newCoordForTurn = button.coord
        }
    }

    companion object {
        var isVertical = true
        var boatTemp = Boat(41, Coordinate(1, 1), isVertical)
    }
}



