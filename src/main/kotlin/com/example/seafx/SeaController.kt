package com.example.seafx

import javafx.fxml.FXML
import Cell.HumanButton
import Cell.RobotButton
import Cell.SeaButton
import coordinates.HumanCoordGetterController
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.control.ToggleButton

import java.net.URL
import java.util.*


open class SeaController() : Initializable, View(){

    @FXML
    lateinit var topLabel: Label

//    @FXML
//    lateinit var humanLabelTop: Label

    @FXML
    lateinit var robotLabelTop: Label

    @FXML
    lateinit var humanLabel2: Label

    @FXML
    lateinit var robotLabel2: Label

    @FXML
    lateinit var horizontButton: ToggleButton

    @FXML
    lateinit var verticalButton: ToggleButton


    @FXML
    private fun seaClick() {
    }

    @FXML
    private fun horizontClick() {
        HumanCoordGetterController.isVertical = false
    }

    @FXML
    private fun verticalClick() {
        HumanCoordGetterController.isVertical = true
    }


    @FXML
    private fun seaMouseOver() {

    }

    @FXML
    lateinit var humanButton11: HumanButton

    @FXML
    lateinit var humanButton12: HumanButton

    @FXML
    lateinit var humanButton13: HumanButton

    @FXML
    lateinit var humanButton14: HumanButton

    @FXML
    lateinit var humanButton15: HumanButton

    @FXML
    lateinit var humanButton16: HumanButton

    @FXML
    lateinit var humanButton17: HumanButton

    @FXML
    lateinit var humanButton18: HumanButton

    @FXML
    lateinit var humanButton19: HumanButton

    @FXML
    lateinit var humanButton110: HumanButton

    @FXML
    lateinit var humanButton21: HumanButton

    @FXML
    lateinit var humanButton22: HumanButton

    @FXML
    lateinit var humanButton23: HumanButton

    @FXML
    lateinit var humanButton24: HumanButton

    @FXML
    lateinit var humanButton25: HumanButton

    @FXML
    lateinit var humanButton26: HumanButton

    @FXML
    lateinit var humanButton27: HumanButton

    @FXML
    lateinit var humanButton28: HumanButton

    @FXML
    lateinit var humanButton29: HumanButton

    @FXML
    lateinit var humanButton210: HumanButton

    @FXML
    lateinit var humanButton31: HumanButton

    @FXML
    lateinit var humanButton32: HumanButton

    @FXML
    lateinit var humanButton33: HumanButton

    @FXML
    lateinit var humanButton34: HumanButton

    @FXML
    lateinit var humanButton35: HumanButton

    @FXML
    lateinit var humanButton36: HumanButton

    @FXML
    lateinit var humanButton37: HumanButton

    @FXML
    lateinit var humanButton38: HumanButton

    @FXML
    lateinit var humanButton39: HumanButton

    @FXML
    lateinit var humanButton310: HumanButton

    @FXML
    lateinit var humanButton41: HumanButton

    @FXML
    lateinit var humanButton42: HumanButton

    @FXML
    lateinit var humanButton43: HumanButton

    @FXML
    lateinit var humanButton44: HumanButton

    @FXML
    lateinit var humanButton45: HumanButton

    @FXML
    lateinit var humanButton46: HumanButton

    @FXML
    lateinit var humanButton47: HumanButton

    @FXML
    lateinit var humanButton48: HumanButton

    @FXML
    lateinit var humanButton49: HumanButton

    @FXML
    lateinit var humanButton410: HumanButton

    @FXML
    lateinit var humanButton51: HumanButton

    @FXML
    lateinit var humanButton52: HumanButton

    @FXML
    lateinit var humanButton53: HumanButton

    @FXML
    lateinit var humanButton54: HumanButton

    @FXML
    lateinit var humanButton55: HumanButton

    @FXML
    lateinit var humanButton56: HumanButton

    @FXML
    lateinit var humanButton57: HumanButton

    @FXML
    lateinit var humanButton58: HumanButton

    @FXML
    lateinit var humanButton59: HumanButton

    @FXML
    lateinit var humanButton510: HumanButton

    @FXML
    lateinit var humanButton61: HumanButton

    @FXML
    lateinit var humanButton62: HumanButton

    @FXML
    lateinit var humanButton63: HumanButton

    @FXML
    lateinit var humanButton64: HumanButton

    @FXML
    lateinit var humanButton65: HumanButton

    @FXML
    lateinit var humanButton66: HumanButton

    @FXML
    lateinit var humanButton67: HumanButton

    @FXML
    lateinit var humanButton68: HumanButton

    @FXML
    lateinit var humanButton69: HumanButton

    @FXML
    lateinit var humanButton610: HumanButton

    @FXML
    lateinit var humanButton71: HumanButton

    @FXML
    lateinit var humanButton72: HumanButton

    @FXML
    lateinit var humanButton73: HumanButton

    @FXML
    lateinit var humanButton74: HumanButton

    @FXML
    lateinit var humanButton75: HumanButton

    @FXML
    lateinit var humanButton76: HumanButton

    @FXML
    lateinit var humanButton77: HumanButton

    @FXML
    lateinit var humanButton78: HumanButton

    @FXML
    lateinit var humanButton79: HumanButton

    @FXML
    lateinit var humanButton710: HumanButton

    @FXML
    lateinit var humanButton81: HumanButton

    @FXML
    lateinit var humanButton82: HumanButton

    @FXML
    lateinit var humanButton83: HumanButton

    @FXML
    lateinit var humanButton84: HumanButton

    @FXML
    lateinit var humanButton85: HumanButton

    @FXML
    lateinit var humanButton86: HumanButton

    @FXML
    lateinit var humanButton87: HumanButton

    @FXML
    lateinit var humanButton88: HumanButton

    @FXML
    lateinit var humanButton89: HumanButton

    @FXML
    lateinit var humanButton810: HumanButton

    @FXML
    lateinit var humanButton91: HumanButton

    @FXML
    lateinit var humanButton92: HumanButton

    @FXML
    lateinit var humanButton93: HumanButton

    @FXML
    lateinit var humanButton94: HumanButton

    @FXML
    lateinit var humanButton95: HumanButton

    @FXML
    lateinit var humanButton96: HumanButton

    @FXML
    lateinit var humanButton97: HumanButton

    @FXML
    lateinit var humanButton98: HumanButton

    @FXML
    lateinit var humanButton99: HumanButton

    @FXML
    lateinit var humanButton910: HumanButton

    @FXML
    lateinit var humanButton101: HumanButton

    @FXML
    lateinit var humanButton102: HumanButton

    @FXML
    lateinit var humanButton103: HumanButton

    @FXML
    lateinit var humanButton104: HumanButton

    @FXML
    lateinit var humanButton105: HumanButton

    @FXML
    lateinit var humanButton106: HumanButton

    @FXML
    lateinit var humanButton107: HumanButton

    @FXML
    lateinit var humanButton108: HumanButton

    @FXML
    lateinit var humanButton109: HumanButton

    @FXML
    lateinit var humanButton1010: HumanButton

    @FXML
    lateinit var robotButton11: RobotButton

    @FXML
    lateinit var robotButton12: RobotButton

    @FXML
    lateinit var robotButton13: RobotButton

    @FXML
    lateinit var robotButton14: RobotButton

    @FXML
    lateinit var robotButton15: RobotButton

    @FXML
    lateinit var robotButton16: RobotButton

    @FXML
    lateinit var robotButton17: RobotButton

    @FXML
    lateinit var robotButton18: RobotButton

    @FXML
    lateinit var robotButton19: RobotButton

    @FXML
    lateinit var robotButton110: RobotButton

    @FXML
    lateinit var robotButton21: RobotButton

    @FXML
    lateinit var robotButton22: RobotButton

    @FXML
    lateinit var robotButton23: RobotButton

    @FXML
    lateinit var robotButton24: RobotButton

    @FXML
    lateinit var robotButton25: RobotButton

    @FXML
    lateinit var robotButton26: RobotButton

    @FXML
    lateinit var robotButton27: RobotButton

    @FXML
    lateinit var robotButton28: RobotButton

    @FXML
    lateinit var robotButton29: RobotButton

    @FXML
    lateinit var robotButton210: RobotButton

    @FXML
    lateinit var robotButton31: RobotButton

    @FXML
    lateinit var robotButton32: RobotButton

    @FXML
    lateinit var robotButton33: RobotButton

    @FXML
    lateinit var robotButton34: RobotButton

    @FXML
    lateinit var robotButton35: RobotButton

    @FXML
    lateinit var robotButton36: RobotButton

    @FXML
    lateinit var robotButton37: RobotButton

    @FXML
    lateinit var robotButton38: RobotButton

    @FXML
    lateinit var robotButton39: RobotButton

    @FXML
    lateinit var robotButton310: RobotButton

    @FXML
    lateinit var robotButton41: RobotButton

    @FXML
    lateinit var robotButton42: RobotButton

    @FXML
    lateinit var robotButton43: RobotButton

    @FXML
    lateinit var robotButton44: RobotButton

    @FXML
    lateinit var robotButton45: RobotButton

    @FXML
    lateinit var robotButton46: RobotButton

    @FXML
    lateinit var robotButton47: RobotButton

    @FXML
    lateinit var robotButton48: RobotButton

    @FXML
    lateinit var robotButton49: RobotButton

    @FXML
    lateinit var robotButton410: RobotButton

    @FXML
    lateinit var robotButton51: RobotButton

    @FXML
    lateinit var robotButton52: RobotButton

    @FXML
    lateinit var robotButton53: RobotButton

    @FXML
    lateinit var robotButton54: RobotButton

    @FXML
    lateinit var robotButton55: RobotButton

    @FXML
    lateinit var robotButton56: RobotButton

    @FXML
    lateinit var robotButton57: RobotButton

    @FXML
    lateinit var robotButton58: RobotButton

    @FXML
    lateinit var robotButton59: RobotButton

    @FXML
    lateinit var robotButton510: RobotButton

    @FXML
    lateinit var robotButton61: RobotButton

    @FXML
    lateinit var robotButton62: RobotButton

    @FXML
    lateinit var robotButton63: RobotButton

    @FXML
    lateinit var robotButton64: RobotButton

    @FXML
    lateinit var robotButton65: RobotButton

    @FXML
    lateinit var robotButton66: RobotButton

    @FXML
    lateinit var robotButton67: RobotButton

    @FXML
    lateinit var robotButton68: RobotButton

    @FXML
    lateinit var robotButton69: RobotButton

    @FXML
    lateinit var robotButton610: RobotButton

    @FXML
    lateinit var robotButton71: RobotButton

    @FXML
    lateinit var robotButton72: RobotButton

    @FXML
    lateinit var robotButton73: RobotButton

    @FXML
    lateinit var robotButton74: RobotButton

    @FXML
    lateinit var robotButton75: RobotButton

    @FXML
    lateinit var robotButton76: RobotButton

    @FXML
    lateinit var robotButton77: RobotButton

    @FXML
    lateinit var robotButton78: RobotButton

    @FXML
    lateinit var robotButton79: RobotButton

    @FXML
    lateinit var robotButton710: RobotButton

    @FXML
    lateinit var robotButton81: RobotButton

    @FXML
    lateinit var robotButton82: RobotButton

    @FXML
    lateinit var robotButton83: RobotButton

    @FXML
    lateinit var robotButton84: RobotButton

    @FXML
    lateinit var robotButton85: RobotButton

    @FXML
    lateinit var robotButton86: RobotButton

    @FXML
    lateinit var robotButton87: RobotButton

    @FXML
    lateinit var robotButton88: RobotButton

    @FXML
    lateinit var robotButton89: RobotButton

    @FXML
    lateinit var robotButton810: RobotButton

    @FXML
    lateinit var robotButton91: RobotButton

    @FXML
    lateinit var robotButton92: RobotButton

    @FXML
    lateinit var robotButton93: RobotButton

    @FXML
    lateinit var robotButton94: RobotButton

    @FXML
    lateinit var robotButton95: RobotButton

    @FXML
    lateinit var robotButton96: RobotButton

    @FXML
    lateinit var robotButton97: RobotButton

    @FXML
    lateinit var robotButton98: RobotButton

    @FXML
    lateinit var robotButton99: RobotButton

    @FXML
    lateinit var robotButton910: RobotButton

    @FXML
    lateinit var robotButton101: RobotButton

    @FXML
    lateinit var robotButton102: RobotButton

    @FXML
    lateinit var robotButton103: RobotButton

    @FXML
    lateinit var robotButton104: RobotButton

    @FXML
    lateinit var robotButton105: RobotButton

    @FXML
    lateinit var robotButton106: RobotButton

    @FXML
    lateinit var robotButton107: RobotButton

    @FXML
    lateinit var robotButton108: RobotButton

    @FXML
    lateinit var robotButton109: RobotButton

    @FXML
    lateinit var robotButton1010: RobotButton

    companion object {
        val humanButtonMap = mutableMapOf<Int, SeaButton>()
        val robotButtonMap = mutableMapOf<Int, SeaButton>()
        var humanCoordGetterController: HumanCoordGetterController? = null
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {

        humanCoordGetterController = HumanCoordGetterController()
        View.topLabel = topLabel
//        View.humanLabelTop = humanLabelTop
        View.robotLabelTop = robotLabelTop
        View.humanLabel2 = humanLabel2
        View.robotLabel2 = robotLabel2
        View.horizontButton = horizontButton
        View.verticalButton = verticalButton

        Model.start()

        humanButtonMap.put(humanButton11.id, humanButton11)
        humanButtonMap.put(humanButton12.id, humanButton12)
        humanButtonMap.put(humanButton13.id, humanButton13)
        humanButtonMap.put(humanButton14.id, humanButton14)
        humanButtonMap.put(humanButton15.id, humanButton15)
        humanButtonMap.put(humanButton16.id, humanButton16)
        humanButtonMap.put(humanButton17.id, humanButton17)
        humanButtonMap.put(humanButton18.id, humanButton18)
        humanButtonMap.put(humanButton19.id, humanButton19)
        humanButtonMap.put(humanButton110.id, humanButton110)
        humanButtonMap.put(humanButton21.id, humanButton21)
        humanButtonMap.put(humanButton22.id, humanButton22)
        humanButtonMap.put(humanButton23.id, humanButton23)
        humanButtonMap.put(humanButton24.id, humanButton24)
        humanButtonMap.put(humanButton25.id, humanButton25)
        humanButtonMap.put(humanButton26.id, humanButton26)
        humanButtonMap.put(humanButton27.id, humanButton27)
        humanButtonMap.put(humanButton28.id, humanButton28)
        humanButtonMap.put(humanButton29.id, humanButton29)
        humanButtonMap.put(humanButton210.id, humanButton210)
        humanButtonMap.put(humanButton31.id, humanButton31)
        humanButtonMap.put(humanButton32.id, humanButton32)
        humanButtonMap.put(humanButton33.id, humanButton33)
        humanButtonMap.put(humanButton34.id, humanButton34)
        humanButtonMap.put(humanButton35.id, humanButton35)
        humanButtonMap.put(humanButton36.id, humanButton36)
        humanButtonMap.put(humanButton37.id, humanButton37)
        humanButtonMap.put(humanButton38.id, humanButton38)
        humanButtonMap.put(humanButton39.id, humanButton39)
        humanButtonMap.put(humanButton310.id, humanButton310)
        humanButtonMap.put(humanButton41.id, humanButton41)
        humanButtonMap.put(humanButton42.id, humanButton42)
        humanButtonMap.put(humanButton43.id, humanButton43)
        humanButtonMap.put(humanButton44.id, humanButton44)
        humanButtonMap.put(humanButton45.id, humanButton45)
        humanButtonMap.put(humanButton46.id, humanButton46)
        humanButtonMap.put(humanButton47.id, humanButton47)
        humanButtonMap.put(humanButton48.id, humanButton48)
        humanButtonMap.put(humanButton49.id, humanButton49)
        humanButtonMap.put(humanButton410.id, humanButton410)
        humanButtonMap.put(humanButton51.id, humanButton51)
        humanButtonMap.put(humanButton52.id, humanButton52)
        humanButtonMap.put(humanButton53.id, humanButton53)
        humanButtonMap.put(humanButton54.id, humanButton54)
        humanButtonMap.put(humanButton55.id, humanButton55)
        humanButtonMap.put(humanButton56.id, humanButton56)
        humanButtonMap.put(humanButton57.id, humanButton57)
        humanButtonMap.put(humanButton58.id, humanButton58)
        humanButtonMap.put(humanButton59.id, humanButton59)
        humanButtonMap.put(humanButton510.id, humanButton510)
        humanButtonMap.put(humanButton61.id, humanButton61)
        humanButtonMap.put(humanButton62.id, humanButton62)
        humanButtonMap.put(humanButton63.id, humanButton63)
        humanButtonMap.put(humanButton64.id, humanButton64)
        humanButtonMap.put(humanButton65.id, humanButton65)
        humanButtonMap.put(humanButton66.id, humanButton66)
        humanButtonMap.put(humanButton67.id, humanButton67)
        humanButtonMap.put(humanButton68.id, humanButton68)
        humanButtonMap.put(humanButton69.id, humanButton69)
        humanButtonMap.put(humanButton610.id, humanButton610)
        humanButtonMap.put(humanButton71.id, humanButton71)
        humanButtonMap.put(humanButton72.id, humanButton72)
        humanButtonMap.put(humanButton73.id, humanButton73)
        humanButtonMap.put(humanButton74.id, humanButton74)
        humanButtonMap.put(humanButton75.id, humanButton75)
        humanButtonMap.put(humanButton76.id, humanButton76)
        humanButtonMap.put(humanButton77.id, humanButton77)
        humanButtonMap.put(humanButton78.id, humanButton78)
        humanButtonMap.put(humanButton79.id, humanButton79)
        humanButtonMap.put(humanButton710.id, humanButton710)
        humanButtonMap.put(humanButton81.id, humanButton81)
        humanButtonMap.put(humanButton82.id, humanButton82)
        humanButtonMap.put(humanButton83.id, humanButton83)
        humanButtonMap.put(humanButton84.id, humanButton84)
        humanButtonMap.put(humanButton85.id, humanButton85)
        humanButtonMap.put(humanButton86.id, humanButton86)
        humanButtonMap.put(humanButton87.id, humanButton87)
        humanButtonMap.put(humanButton88.id, humanButton88)
        humanButtonMap.put(humanButton89.id, humanButton89)
        humanButtonMap.put(humanButton810.id, humanButton810)
        humanButtonMap.put(humanButton91.id, humanButton91)
        humanButtonMap.put(humanButton92.id, humanButton92)
        humanButtonMap.put(humanButton93.id, humanButton93)
        humanButtonMap.put(humanButton94.id, humanButton94)
        humanButtonMap.put(humanButton95.id, humanButton95)
        humanButtonMap.put(humanButton96.id, humanButton96)
        humanButtonMap.put(humanButton97.id, humanButton97)
        humanButtonMap.put(humanButton98.id, humanButton98)
        humanButtonMap.put(humanButton99.id, humanButton99)
        humanButtonMap.put(humanButton910.id, humanButton910)
        humanButtonMap.put(humanButton101.id, humanButton101)
        humanButtonMap.put(humanButton102.id, humanButton102)
        humanButtonMap.put(humanButton103.id, humanButton103)
        humanButtonMap.put(humanButton104.id, humanButton104)
        humanButtonMap.put(humanButton105.id, humanButton105)
        humanButtonMap.put(humanButton106.id, humanButton106)
        humanButtonMap.put(humanButton107.id, humanButton107)
        humanButtonMap.put(humanButton108.id, humanButton108)
        humanButtonMap.put(humanButton109.id, humanButton109)
        humanButtonMap.put(humanButton1010.id, humanButton1010)

        robotButtonMap.put(robotButton11.id, robotButton11)
        robotButtonMap.put(robotButton12.id, robotButton12)
        robotButtonMap.put(robotButton13.id, robotButton13)
        robotButtonMap.put(robotButton14.id, robotButton14)
        robotButtonMap.put(robotButton15.id, robotButton15)
        robotButtonMap.put(robotButton16.id, robotButton16)
        robotButtonMap.put(robotButton17.id, robotButton17)
        robotButtonMap.put(robotButton18.id, robotButton18)
        robotButtonMap.put(robotButton19.id, robotButton19)
        robotButtonMap.put(robotButton110.id, robotButton110)
        robotButtonMap.put(robotButton21.id, robotButton21)
        robotButtonMap.put(robotButton22.id, robotButton22)
        robotButtonMap.put(robotButton23.id, robotButton23)
        robotButtonMap.put(robotButton24.id, robotButton24)
        robotButtonMap.put(robotButton25.id, robotButton25)
        robotButtonMap.put(robotButton26.id, robotButton26)
        robotButtonMap.put(robotButton27.id, robotButton27)
        robotButtonMap.put(robotButton28.id, robotButton28)
        robotButtonMap.put(robotButton29.id, robotButton29)
        robotButtonMap.put(robotButton210.id, robotButton210)
        robotButtonMap.put(robotButton31.id, robotButton31)
        robotButtonMap.put(robotButton32.id, robotButton32)
        robotButtonMap.put(robotButton33.id, robotButton33)
        robotButtonMap.put(robotButton34.id, robotButton34)
        robotButtonMap.put(robotButton35.id, robotButton35)
        robotButtonMap.put(robotButton36.id, robotButton36)
        robotButtonMap.put(robotButton37.id, robotButton37)
        robotButtonMap.put(robotButton38.id, robotButton38)
        robotButtonMap.put(robotButton39.id, robotButton39)
        robotButtonMap.put(robotButton310.id, robotButton310)
        robotButtonMap.put(robotButton41.id, robotButton41)
        robotButtonMap.put(robotButton42.id, robotButton42)
        robotButtonMap.put(robotButton43.id, robotButton43)
        robotButtonMap.put(robotButton44.id, robotButton44)
        robotButtonMap.put(robotButton45.id, robotButton45)
        robotButtonMap.put(robotButton46.id, robotButton46)
        robotButtonMap.put(robotButton47.id, robotButton47)
        robotButtonMap.put(robotButton48.id, robotButton48)
        robotButtonMap.put(robotButton49.id, robotButton49)
        robotButtonMap.put(robotButton410.id, robotButton410)
        robotButtonMap.put(robotButton51.id, robotButton51)
        robotButtonMap.put(robotButton52.id, robotButton52)
        robotButtonMap.put(robotButton53.id, robotButton53)
        robotButtonMap.put(robotButton54.id, robotButton54)
        robotButtonMap.put(robotButton55.id, robotButton55)
        robotButtonMap.put(robotButton56.id, robotButton56)
        robotButtonMap.put(robotButton57.id, robotButton57)
        robotButtonMap.put(robotButton58.id, robotButton58)
        robotButtonMap.put(robotButton59.id, robotButton59)
        robotButtonMap.put(robotButton510.id, robotButton510)
        robotButtonMap.put(robotButton61.id, robotButton61)
        robotButtonMap.put(robotButton62.id, robotButton62)
        robotButtonMap.put(robotButton63.id, robotButton63)
        robotButtonMap.put(robotButton64.id, robotButton64)
        robotButtonMap.put(robotButton65.id, robotButton65)
        robotButtonMap.put(robotButton66.id, robotButton66)
        robotButtonMap.put(robotButton67.id, robotButton67)
        robotButtonMap.put(robotButton68.id, robotButton68)
        robotButtonMap.put(robotButton69.id, robotButton69)
        robotButtonMap.put(robotButton610.id, robotButton610)
        robotButtonMap.put(robotButton71.id, robotButton71)
        robotButtonMap.put(robotButton72.id, robotButton72)
        robotButtonMap.put(robotButton73.id, robotButton73)
        robotButtonMap.put(robotButton74.id, robotButton74)
        robotButtonMap.put(robotButton75.id, robotButton75)
        robotButtonMap.put(robotButton76.id, robotButton76)
        robotButtonMap.put(robotButton77.id, robotButton77)
        robotButtonMap.put(robotButton78.id, robotButton78)
        robotButtonMap.put(robotButton79.id, robotButton79)
        robotButtonMap.put(robotButton710.id, robotButton710)
        robotButtonMap.put(robotButton81.id, robotButton81)
        robotButtonMap.put(robotButton82.id, robotButton82)
        robotButtonMap.put(robotButton83.id, robotButton83)
        robotButtonMap.put(robotButton84.id, robotButton84)
        robotButtonMap.put(robotButton85.id, robotButton85)
        robotButtonMap.put(robotButton86.id, robotButton86)
        robotButtonMap.put(robotButton87.id, robotButton87)
        robotButtonMap.put(robotButton88.id, robotButton88)
        robotButtonMap.put(robotButton89.id, robotButton89)
        robotButtonMap.put(robotButton810.id, robotButton810)
        robotButtonMap.put(robotButton91.id, robotButton91)
        robotButtonMap.put(robotButton92.id, robotButton92)
        robotButtonMap.put(robotButton93.id, robotButton93)
        robotButtonMap.put(robotButton94.id, robotButton94)
        robotButtonMap.put(robotButton95.id, robotButton95)
        robotButtonMap.put(robotButton96.id, robotButton96)
        robotButtonMap.put(robotButton97.id, robotButton97)
        robotButtonMap.put(robotButton98.id, robotButton98)
        robotButtonMap.put(robotButton99.id, robotButton99)
        robotButtonMap.put(robotButton910.id, robotButton910)
        robotButtonMap.put(robotButton101.id, robotButton101)
        robotButtonMap.put(robotButton102.id, robotButton102)
        robotButtonMap.put(robotButton103.id, robotButton103)
        robotButtonMap.put(robotButton104.id, robotButton104)
        robotButtonMap.put(robotButton105.id, robotButton105)
        robotButtonMap.put(robotButton106.id, robotButton106)
        robotButtonMap.put(robotButton107.id, robotButton107)
        robotButtonMap.put(robotButton108.id, robotButton108)
        robotButtonMap.put(robotButton109.id, robotButton109)
        robotButtonMap.put(robotButton1010.id, robotButton1010)
    }
}


