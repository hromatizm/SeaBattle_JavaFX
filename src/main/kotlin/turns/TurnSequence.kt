package turns

import kotlinx.coroutines.delay
import kotlin.system.exitProcess

// Поочередные ходы. Получает в качестве параметра коллекцию типа Turn
class TurnSequence(val players: List<Turn>) {

    // Ходы делаются по очереди до тех пор, пока не неступит GAME OVER в каком-то из Turn в коллекции.
    suspend fun start(): Int {
        var isGoingOn = true
        var turnCounter = 0
        var result = false to 0
        while (isGoingOn) {
            for (player in players) {
                result = player.makeTurn()
                isGoingOn = result.first
                if(!isGoingOn) {
                    delay(10_000)
                    exitProcess(0)
                }
                turnCounter = result.second
            }
        }
        return turnCounter // Нужно для анализа при массовых случайных расстановках
    }
}