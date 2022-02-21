package Cell

import coordinates.Coordinate
import javafx.scene.control.Button

open class SeaButton : Button() {
    var id = 0
    lateinit var coord: Coordinate
}