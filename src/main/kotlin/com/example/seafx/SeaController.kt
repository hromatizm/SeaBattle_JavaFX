package com.example.seafx

import javafx.fxml.FXML
import javafx.scene.control.ToggleButton
import Cell.SeaButton
import coordinates.HumanBoatCoordGetter
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import java.net.URL
import java.util.*


open class SeaController() : Initializable {

    val model = Model()

    @FXML
    private lateinit var myLabel: Label

    @FXML
    private fun seaClick() {
    }

    @FXML
    private fun horizontClick() {
        HumanBoatCoordGetter.isVertical = false
    }

    @FXML
    private fun verticalClick() {
        HumanBoatCoordGetter.isVertical = true
    }


    @FXML
    private fun seaMouseOver() {

    }

    @FXML
    lateinit var button11: SeaButton

    @FXML
    lateinit var button12: SeaButton

    @FXML
    lateinit var button13: SeaButton

    @FXML
    lateinit var button14: SeaButton

    @FXML
    lateinit var button15: SeaButton

    @FXML
    lateinit var button16: SeaButton

    @FXML
    lateinit var button17: SeaButton

    @FXML
    lateinit var button18: SeaButton

    @FXML
    lateinit var button19: SeaButton

    @FXML
    lateinit var button110: SeaButton

    @FXML
    lateinit var button21: SeaButton

    @FXML
    lateinit var button22: SeaButton

    @FXML
    lateinit var button23: SeaButton

    @FXML
    lateinit var button24: SeaButton

    @FXML
    lateinit var button25: SeaButton

    @FXML
    lateinit var button26: SeaButton

    @FXML
    lateinit var button27: SeaButton

    @FXML
    lateinit var button28: SeaButton

    @FXML
    lateinit var button29: SeaButton

    @FXML
    lateinit var button210: SeaButton

    @FXML
    lateinit var button31: SeaButton

    @FXML
    lateinit var button32: SeaButton

    @FXML
    lateinit var button33: SeaButton

    @FXML
    lateinit var button34: SeaButton

    @FXML
    lateinit var button35: SeaButton

    @FXML
    lateinit var button36: SeaButton

    @FXML
    lateinit var button37: SeaButton

    @FXML
    lateinit var button38: SeaButton

    @FXML
    lateinit var button39: SeaButton

    @FXML
    lateinit var button310: SeaButton

    @FXML
    lateinit var button41: SeaButton

    @FXML
    lateinit var button42: SeaButton

    @FXML
    lateinit var button43: SeaButton

    @FXML
    lateinit var button44: SeaButton

    @FXML
    lateinit var button45: SeaButton

    @FXML
    lateinit var button46: SeaButton

    @FXML
    lateinit var button47: SeaButton

    @FXML
    lateinit var button48: SeaButton

    @FXML
    lateinit var button49: SeaButton

    @FXML
    lateinit var button410: SeaButton

    @FXML
    lateinit var button51: SeaButton

    @FXML
    lateinit var button52: SeaButton

    @FXML
    lateinit var button53: SeaButton

    @FXML
    lateinit var button54: SeaButton

    @FXML
    lateinit var button55: SeaButton

    @FXML
    lateinit var button56: SeaButton

    @FXML
    lateinit var button57: SeaButton

    @FXML
    lateinit var button58: SeaButton

    @FXML
    lateinit var button59: SeaButton

    @FXML
    lateinit var button510: SeaButton

    @FXML
    lateinit var button61: SeaButton

    @FXML
    lateinit var button62: SeaButton

    @FXML
    lateinit var button63: SeaButton

    @FXML
    lateinit var button64: SeaButton

    @FXML
    lateinit var button65: SeaButton

    @FXML
    lateinit var button66: SeaButton

    @FXML
    lateinit var button67: SeaButton

    @FXML
    lateinit var button68: SeaButton

    @FXML
    lateinit var button69: SeaButton

    @FXML
    lateinit var button610: SeaButton

    @FXML
    lateinit var button71: SeaButton

    @FXML
    lateinit var button72: SeaButton

    @FXML
    lateinit var button73: SeaButton

    @FXML
    lateinit var button74: SeaButton

    @FXML
    lateinit var button75: SeaButton

    @FXML
    lateinit var button76: SeaButton

    @FXML
    lateinit var button77: SeaButton

    @FXML
    lateinit var button78: SeaButton

    @FXML
    lateinit var button79: SeaButton

    @FXML
    lateinit var button710: SeaButton

    @FXML
    lateinit var button81: SeaButton

    @FXML
    lateinit var button82: SeaButton

    @FXML
    lateinit var button83: SeaButton

    @FXML
    lateinit var button84: SeaButton

    @FXML
    lateinit var button85: SeaButton

    @FXML
    lateinit var button86: SeaButton

    @FXML
    lateinit var button87: SeaButton

    @FXML
    lateinit var button88: SeaButton

    @FXML
    lateinit var button89: SeaButton

    @FXML
    lateinit var button810: SeaButton

    @FXML
    lateinit var button91: SeaButton

    @FXML
    lateinit var button92: SeaButton

    @FXML
    lateinit var button93: SeaButton

    @FXML
    lateinit var button94: SeaButton

    @FXML
    lateinit var button95: SeaButton

    @FXML
    lateinit var button96: SeaButton

    @FXML
    lateinit var button97: SeaButton

    @FXML
    lateinit var button98: SeaButton

    @FXML
    lateinit var button99: SeaButton

    @FXML
    lateinit var button910: SeaButton

    @FXML
    lateinit var button101: SeaButton

    @FXML
    lateinit var button102: SeaButton

    @FXML
    lateinit var button103: SeaButton

    @FXML
    lateinit var button104: SeaButton

    @FXML
    lateinit var button105: SeaButton

    @FXML
    lateinit var button106: SeaButton

    @FXML
    lateinit var button107: SeaButton

    @FXML
    lateinit var button108: SeaButton

    @FXML
    lateinit var button109: SeaButton

    @FXML
    lateinit var button1010: SeaButton

    companion object {
        var seaButtonMap = mutableMapOf<Int, Button>()
        var humanBoatCoordGetter: HumanBoatCoordGetter? = null
    }

    //    @FXML
//    private fun installBoat() {
//        humanBoatCoordGetter = HumanBoatCoordGetter()
//
//    }
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        humanBoatCoordGetter = HumanBoatCoordGetter()
        model.installBoats(myLabel)
        seaButtonMap.put(button11.cell.id, button11)
        seaButtonMap.put(button12.cell.id, button12)
        seaButtonMap.put(button13.cell.id, button13)
        seaButtonMap.put(button14.cell.id, button14)
        seaButtonMap.put(button15.cell.id, button15)
        seaButtonMap.put(button16.cell.id, button16)
        seaButtonMap.put(button17.cell.id, button17)
        seaButtonMap.put(button18.cell.id, button18)
        seaButtonMap.put(button19.cell.id, button19)
        seaButtonMap.put(button110.cell.id, button110)
        seaButtonMap.put(button21.cell.id, button21)
        seaButtonMap.put(button22.cell.id, button22)
        seaButtonMap.put(button23.cell.id, button23)
        seaButtonMap.put(button24.cell.id, button24)
        seaButtonMap.put(button25.cell.id, button25)
        seaButtonMap.put(button26.cell.id, button26)
        seaButtonMap.put(button27.cell.id, button27)
        seaButtonMap.put(button28.cell.id, button28)
        seaButtonMap.put(button29.cell.id, button29)
        seaButtonMap.put(button210.cell.id, button210)
        seaButtonMap.put(button31.cell.id, button31)
        seaButtonMap.put(button32.cell.id, button32)
        seaButtonMap.put(button33.cell.id, button33)
        seaButtonMap.put(button34.cell.id, button34)
        seaButtonMap.put(button35.cell.id, button35)
        seaButtonMap.put(button36.cell.id, button36)
        seaButtonMap.put(button37.cell.id, button37)
        seaButtonMap.put(button38.cell.id, button38)
        seaButtonMap.put(button39.cell.id, button39)
        seaButtonMap.put(button310.cell.id, button310)
        seaButtonMap.put(button41.cell.id, button41)
        seaButtonMap.put(button42.cell.id, button42)
        seaButtonMap.put(button43.cell.id, button43)
        seaButtonMap.put(button44.cell.id, button44)
        seaButtonMap.put(button45.cell.id, button45)
        seaButtonMap.put(button46.cell.id, button46)
        seaButtonMap.put(button47.cell.id, button47)
        seaButtonMap.put(button48.cell.id, button48)
        seaButtonMap.put(button49.cell.id, button49)
        seaButtonMap.put(button410.cell.id, button410)
        seaButtonMap.put(button51.cell.id, button51)
        seaButtonMap.put(button52.cell.id, button52)
        seaButtonMap.put(button53.cell.id, button53)
        seaButtonMap.put(button54.cell.id, button54)
        seaButtonMap.put(button55.cell.id, button55)
        seaButtonMap.put(button56.cell.id, button56)
        seaButtonMap.put(button57.cell.id, button57)
        seaButtonMap.put(button58.cell.id, button58)
        seaButtonMap.put(button59.cell.id, button59)
        seaButtonMap.put(button510.cell.id, button510)
        seaButtonMap.put(button61.cell.id, button61)
        seaButtonMap.put(button62.cell.id, button62)
        seaButtonMap.put(button63.cell.id, button63)
        seaButtonMap.put(button64.cell.id, button64)
        seaButtonMap.put(button65.cell.id, button65)
        seaButtonMap.put(button66.cell.id, button66)
        seaButtonMap.put(button67.cell.id, button67)
        seaButtonMap.put(button68.cell.id, button68)
        seaButtonMap.put(button69.cell.id, button69)
        seaButtonMap.put(button610.cell.id, button610)
        seaButtonMap.put(button71.cell.id, button71)
        seaButtonMap.put(button72.cell.id, button72)
        seaButtonMap.put(button73.cell.id, button73)
        seaButtonMap.put(button74.cell.id, button74)
        seaButtonMap.put(button75.cell.id, button75)
        seaButtonMap.put(button76.cell.id, button76)
        seaButtonMap.put(button77.cell.id, button77)
        seaButtonMap.put(button78.cell.id, button78)
        seaButtonMap.put(button79.cell.id, button79)
        seaButtonMap.put(button710.cell.id, button710)
        seaButtonMap.put(button81.cell.id, button81)
        seaButtonMap.put(button82.cell.id, button82)
        seaButtonMap.put(button83.cell.id, button83)
        seaButtonMap.put(button84.cell.id, button84)
        seaButtonMap.put(button85.cell.id, button85)
        seaButtonMap.put(button86.cell.id, button86)
        seaButtonMap.put(button87.cell.id, button87)
        seaButtonMap.put(button88.cell.id, button88)
        seaButtonMap.put(button89.cell.id, button89)
        seaButtonMap.put(button810.cell.id, button810)
        seaButtonMap.put(button91.cell.id, button91)
        seaButtonMap.put(button92.cell.id, button92)
        seaButtonMap.put(button93.cell.id, button93)
        seaButtonMap.put(button94.cell.id, button94)
        seaButtonMap.put(button95.cell.id, button95)
        seaButtonMap.put(button96.cell.id, button96)
        seaButtonMap.put(button97.cell.id, button97)
        seaButtonMap.put(button98.cell.id, button98)
        seaButtonMap.put(button99.cell.id, button99)
        seaButtonMap.put(button910.cell.id, button910)
        seaButtonMap.put(button101.cell.id, button101)
        seaButtonMap.put(button102.cell.id, button102)
        seaButtonMap.put(button103.cell.id, button103)
        seaButtonMap.put(button104.cell.id, button104)
        seaButtonMap.put(button105.cell.id, button105)
        seaButtonMap.put(button106.cell.id, button106)
        seaButtonMap.put(button107.cell.id, button107)
        seaButtonMap.put(button108.cell.id, button108)
        seaButtonMap.put(button109.cell.id, button109)
        seaButtonMap.put(button1010.cell.id, button1010)
    }
}


