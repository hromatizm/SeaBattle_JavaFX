package Cell

import coordinates.Coordinate
import javafx.scene.control.Button

open class Cell() {
    lateinit var button: Button
    var id: Int = 0
    lateinit var coord: Coordinate

    companion object {
        var cellCounter = 0
        val cellMap = mutableMapOf<Int, Cell>()
    }

    constructor(button: Button) : this() {
        ++cellCounter
        this.button = button
        id = when {
            cellCounter % 10 == 0 -> cellCounter * 10 + 10
            else -> cellCounter + 10
        }
        val number = when {
            cellCounter % 10 == 0 -> cellCounter / 10
            else -> (cellCounter + 10) / 10
        }

        val letter = when {
            cellCounter % 10 == 0 -> 10
            else -> cellCounter - 10 * (cellCounter / 10)
        }
        coord = Coordinate(letter, number)
        cellMap[this.id] = this
    }


}