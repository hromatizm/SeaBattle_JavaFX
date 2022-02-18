package com.example.seafx

import boats.BoatFactory
import boats.BoatInstaller
import fields.TechField
import javafx.scene.control.Label
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import turns.Turn
import turns.TurnSequence

class Model (val humanLabel: Label, val robotLabel: Label){

    val humanTechField = TechField()
    val humanBoatFactory = BoatFactory(humanTechField)
    val humanInstaller = BoatInstaller(humanBoatFactory, true)
    val robotTechField = TechField()
    val robotBoatFactory = BoatFactory(robotTechField)
    val robotInstaller = BoatInstaller(robotBoatFactory, false)


    val robotTurns = Turn(humanTechField, false, humanLabel)
    val turnSequence = TurnSequence(listOf(robotTurns))


    fun start() {
        humanTechField.buttonMap = SeaController.humanButtonMap
        robotTechField.buttonMap = SeaController.robotButtonMap
        GlobalScope.launch {
            humanInstaller.installAllHuman(listOf(41, 31, 32, 21, 22, 23, 11, 12, 13, 14), humanLabel)
            robotInstaller.installAllRobot(listOf(41, 31, 32, 21, 22, 23, 11, 12, 13, 14))
            turnSequence.start()
        }

    }
}