enum class Signal {

    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP

}

object HandshakeCalculator {
    private const val wink = 0b1
    private const val double_blink = 0b10
    private const val close_your_eyes = 0b100
    private const val jump = 0b1000
    private const val reverse = 0b10000

    fun calculateHandshake(input: Int): List<Signal> {
        return listOf(wink, double_blink, close_your_eyes, jump)
                .filter { input and it == it }
                .map { signal(it) }
                .apply { return if (input and reverse == reverse) reversed() else this }
    }

    private fun signal(bin: Int) = when (bin) {
        wink -> Signal.WINK
        double_blink -> Signal.DOUBLE_BLINK
        close_your_eyes -> Signal.CLOSE_YOUR_EYES
        jump -> Signal.JUMP
        else -> throw RuntimeException("Unknown signal")
    }
}
