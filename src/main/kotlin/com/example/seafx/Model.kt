package com.example.seafx

import boats.BoatFactory
import boats.BoatInstaller
import fields.TechField
import javafx.scene.control.Label
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Model {

    val techField = TechField()
    val boatFactory = BoatFactory(techField)
    val installer = BoatInstaller(boatFactory, true)

    fun installBoats(label: Label) {
        GlobalScope.launch {
            installer.installAllHuman(listOf(41, 31, 32, 21, 22, 23, 11, 12, 13, 14), label)
        }
    }
}