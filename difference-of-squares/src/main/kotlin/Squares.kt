import kotlin.math.pow

class Squares(private val input: Int) {

    fun squareOfSum(): Int {
        return (1..input).sum().toDouble().pow(2).toInt()
    }

    fun sumOfSquares(): Int {
        return (1..input).sumBy { it.toDouble().pow(2).toInt() }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}