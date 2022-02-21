package com.example.seafx

import boats.BoatFactory
import boats.BoatInstaller
import fields.TechField
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import turns.Turn
import turns.TurnSequence

open class Model{
    companion object {
        val humanTechField = TechField()
        val humanBoatFactory = BoatFactory(humanTechField)
        val humanInstaller = BoatInstaller(humanBoatFactory, true)
        val robotTechField = TechField()
        val robotBoatFactory = BoatFactory(robotTechField)
        val robotInstaller = BoatInstaller(robotBoatFactory, false)

        val robotTurns = Turn(humanTechField, false, View.humanLabel2)
        val humanTurns = Turn(robotTechField, true, View.robotLabel2)
        val turnSequence = TurnSequence(listOf(robotTurns, humanTurns))

        fun start() {
            humanTechField.buttonMap = SeaController.humanButtonMap
            robotTechField.buttonMap = SeaController.robotButtonMap
            MainScope().launch {
                humanInstaller.installAllHuman(listOf(41, 31, 32, 21, 22, 23, 11, 12, 13, 14), View.humanLabel2)
                View.boatInstallFinished()

                robotInstaller.installAllRobot(listOf(41, 31, 32, 21, 22, 23, 11, 12, 13, 14))
                turnSequence.start()
            }
        }
    }
}