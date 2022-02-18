package Cell

import javafx.scene.control.Button

class RobotButton : Button() {
    val cell = Cell(this)
    init {
        minHeight = 30.0
        minWidth = 30.0
    }
}