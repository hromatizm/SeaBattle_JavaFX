package com.example.seafx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class MyApplication : Application() {

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MyApplication::class.java.getResource("sea.fxml"))
        val scene = Scene(fxmlLoader.load(), 450.0, 540.0)
        stage.title = "Морской бой"
        stage.scene = scene
        stage.show()


//        val techField = TechField()
//        val boatFactory = BoatFactory(techField)

//        val installer = BoatInstaller(boatFactory, true)
////        installer.installAll(listOf(41,31))
//
//        SeaController.setText("Ups")


//        val boatDraft = Boat(41)

//
//        val handlerMouseEnter = object : EventHandler<MouseEvent> {
//            override fun handle(event: MouseEvent?) {
//                if (event?.source is SeaButton) {
//                    var button = event?.source as SeaButton
//                    val boat = Boat(41, button.cell.coord, isVertical)
//
//                    for (cell in Cell.cellMap.values) {
//                        for (coord in boat.coordinates)
//                            if (coord == cell.coord) {
//                                cell.button.graphic = when {
//                                    boat.coordEnd.letter > 10 || boat.coordEnd.number > 10 ->
//                                        Rectangle(12.0, 12.0, Color.GREY)
//                                    else -> Rectangle(12.0, 12.0, Color.RED)
//                                }
//                            }
//                    }
//                }
//            }
//        }
//        val handlerMouseExit = object : EventHandler<MouseEvent> {
//            override fun handle(event: MouseEvent?) {
//                if (event?.source is SeaButton) {
//                    var button = event?.source as SeaButton
//                    val boat = Boat(41, button.cell.coord, isVertical)
//
//                    for (cell in Cell.cellMap.values) {
//                        for (coord in boat.coordinates)
//                            if (coord == cell.coord)
//                                cell.button.graphic = Rectangle(0.0, 0.0)
//                    }
//                }
//            }
//        }
//        val handlerMouseClick = object : EventHandler<MouseEvent> {
//            override fun handle(event: MouseEvent?) {
//
//                if (event?.source is SeaButton) {
//                    var button = event?.source as SeaButton
//                    val boat = Boat(41, button.cell.coord, isVertical)
//                    if (boat.coordEnd.letter <= 10 && boat.coordEnd.number <= 10)
//                        GetCoord.newCoord = button.cell.coord
//                    println("${GetCoord.newCoord?.number}${GetCoord.newCoord?.letter}")
//                }
//            }
//        }
//        for (cell in Cell.cellMap.values) {
//            cell.button.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handlerMouseEnter)
//            cell.button.addEventFilter(MouseEvent.MOUSE_EXITED_TARGET, handlerMouseExit)
//            cell.button.addEventFilter(MouseEvent.MOUSE_CLICKED, handlerMouseClick)
//        }
    }


}

fun main() {


    Application.launch(MyApplication::class.java)
}