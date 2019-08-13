class RotationalCipher(key: Int) {

    private val upperCaseArray = mutableListOf<Char>()
    private val lowerCaseArray = mutableListOf<Char>()

    init {
        val offset = key % 26

        for (i in ('A'..'Z')) {
            var a = i + offset
            if (a > 'Z') a -= 26
            upperCaseArray.add(a)
            lowerCaseArray.add(a.toLowerCase())
        }
    }

    fun encode(plainText: String): String {
        return plainText.map {
            if (it.isLetter()) {
                val asciiValue = it.toUpperCase().toInt() - 65
                if (it.isLowerCase()) lowerCaseArray[asciiValue] else upperCaseArray[asciiValue]
            } else {
                it
            }
        }.joinToString("")
    }
}