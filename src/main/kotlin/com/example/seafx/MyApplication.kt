package com.example.seafx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class MyApplication : Application() {

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MyApplication::class.java.getResource("sea.fxml"))
        val scene = Scene(fxmlLoader.load(), 750.0, 500.0)
        stage.title = "Морской бой"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(MyApplication::class.java)
}