object WordCount {

    fun phrase(sentence: String): Map<String, Int> {
        return sentence.split(Regex("[^a-zA-Z0-9']+"))
                .map { word ->
                    word.filter { it.isLetterOrDigit() || it == '\'' }
                    word.removeSurrounding("'")
                }
                .filterNot { it.isBlank() }
                .groupingBy {
                    it.toLowerCase()
                }
                .eachCount()
    }
}