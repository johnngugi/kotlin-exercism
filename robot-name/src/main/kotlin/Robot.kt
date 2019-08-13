import java.util.*

class Robot {

    lateinit var name: String

    init {
        assignName()
    }

    private fun assignName() {
        val random = Random()

        val firstChar = random.nextUpperCaseChar()
        val secondChar = random.nextUpperCaseChar()

        val firstDigit = random.nextDigit()
        val secondDigit = random.nextDigit()
        val thirdDigit = random.nextDigit()

        val result = StringBuilder()
        result.append(firstChar, secondChar, firstDigit, secondDigit, thirdDigit)

        name = result.toString()
    }

    fun reset() {
        assignName()
    }
}

private fun Random.nextUpperCaseChar(): Char = (this.nextInt(('A'..'Z').count()) + 'A'.toInt()).toChar()

private fun Random.nextDigit(): Int = this.nextInt(10)
