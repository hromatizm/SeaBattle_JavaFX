package com.example.seafx

import javafx.scene.control.Label
import javafx.scene.control.ToggleButton

open class View {
    companion object {
        lateinit var topLabel: Label
        lateinit var humanLabelTop: Label
        lateinit var robotLabelTop: Label
        lateinit var humanLabel2: Label
        lateinit var robotLabel2: Label
        lateinit var horizontButton: ToggleButton
        lateinit var verticalButton: ToggleButton

        fun boatInstallFinished() {
            horizontButton.isVisible = false
            verticalButton.isVisible = false
            humanLabel2.text = "Готово!"
            topLabel.text = ""
        }
    }
}