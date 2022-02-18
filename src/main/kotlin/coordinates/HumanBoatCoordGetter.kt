package coordinates

import Cell.*
import Cell.HumanButton
import boats.Boat
import com.example.seafx.SeaController
import javafx.event.EventHandler
import javafx.scene.input.MouseEvent
import javafx.scene.paint.Color
import javafx.scene.shape.Rectangle

class HumanBoatCoordGetter() : SeaController() {

    companion object {
        var isVertical = true
        var boatTemp = Boat(41, Coordinate(1, 1), isVertical)
    }

    init {
        val handlerMouseEnter = EventHandler<MouseEvent> { event ->
            if (event?.source is HumanButton) {
                val button = event.source as HumanButton
                boatTemp.coordBegin = button.cell.coord
                boatTemp.coordinates[0] = boatTemp.coordBegin
                // Если размер корабля больше чем 1, то добавляем в коллекцию остальные координаты:
                if (boatTemp.size > 1) {
                    for (i in 1 until boatTemp.size) {
                        val last = boatTemp.coordinates[i - 1] // Берем последнюю координату из коллекции
                        val new = when { // На ее основе создаем новую
                            isVertical -> Coordinate(last!!.letter, last.number + 1)
                            else -> Coordinate(last!!.letter + 1, last.number)
                        }
                        boatTemp.coordinates[i] = (new)
                    }
                }
                boatTemp.coordEnd = boatTemp.coordinates[boatTemp.size - 1]!!

                for (cell in Cell.cellMap.values) {
                    for (coord in boatTemp.coordinates)
                        if (coord == cell.coord) {
                            cell.button.graphic = when {
                                boatTemp.coordEnd.letter > 10 || boatTemp.coordEnd.number > 10 ->
                                    Rectangle(12.0, 12.0, Color.GREY)
                                else -> Rectangle(12.0, 12.0, Color.RED)
                            }
                        }
                }
            }
        }
        val handlerMouseExit = EventHandler<MouseEvent> { event ->
            if (event?.source is HumanButton) {
//                val button = event.source as SeaButton
                for (cell in Cell.cellMap.values) {
                    for (coord in boatTemp.coordinates)
                        if (coord == cell.coord)
                            cell.button.graphic = Rectangle(0.0, 0.0)
                }
            }
        }
        val handlerMouseClick = EventHandler<MouseEvent> { event ->
            if (event?.source is HumanButton) {
                val button = event.source as HumanButton
                if (boatTemp.coordEnd.letter <= 10 && boatTemp.coordEnd.number <= 10)
                    GetCoord.newCoord = button.cell.coord
                for (cell in Cell.cellMap.values) {
                    for (coord in boatTemp.coordinates)
                        if (coord == cell.coord)
                            cell.button.graphic = Rectangle(0.0, 0.0)
                }

            }
        }
        for (cell in Cell.cellMap.values) {
            cell.button.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handlerMouseEnter)
            cell.button.addEventFilter(MouseEvent.MOUSE_EXITED_TARGET, handlerMouseExit)
            cell.button.addEventFilter(MouseEvent.MOUSE_CLICKED, handlerMouseClick)
        }
    }
}



