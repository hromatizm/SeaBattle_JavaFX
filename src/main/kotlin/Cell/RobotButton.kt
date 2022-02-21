package Cell

import coordinates.Coordinate

open class RobotButton : SeaButton() {
//    var id = 0
//    var coord: Coordinate

    companion object {
        var buttonCounter = 0
        val buttonMap = mutableMapOf<Int, RobotButton>()
    }

    init {
        minHeight = 30.0
        minWidth = 30.0

        ++buttonCounter
        id = when {
            buttonCounter % 10 == 0 -> buttonCounter * 10 + 10
            else -> buttonCounter + 10
        }
        val number = when {
            buttonCounter % 10 == 0 -> buttonCounter / 10
            else -> (buttonCounter + 10) / 10
        }

        val letter = when {
            buttonCounter % 10 == 0 -> 10
            else -> buttonCounter - 10 * (buttonCounter / 10)
        }
        coord = Coordinate(letter, number)
        buttonMap[this.id] = this
    }
}