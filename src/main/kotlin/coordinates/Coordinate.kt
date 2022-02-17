package coordinates


// Числовая координата клетки:
class Coordinate// Конструктор для действий робота принимает 2 числа
    (
    var letter: Int,// Циферная часть
    var number: Int// Буквенная часть
) {
    val value: Pair<Int, Int>
    var id: Int = 0


    init {
        this.value = letter to number
        id = when {
            letter == 10 -> (number * 100) + letter
            else -> (number * 10) + letter
        }
    }

    companion object {
        fun copy(coord: Coordinate): Coordinate {
            return Coordinate(coord.letter, coord.number)
        }
    }




    // Переопределяем фукцию для сравнения двух координат.
// Нужно для проверки -  может ли корабль с такими координатами корректно стоять на поле.
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Coordinate)
            return false
        return (value.first == other.value.first && value.second == other.value.second)
    }


}