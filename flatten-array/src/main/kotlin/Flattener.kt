object Flattener {
    fun flatten(nestedList: List<Any?>): List<Any?> {
        val flatList: MutableList<Any?> = mutableListOf()

        nestedList.forEach {
            when (it) {
                !is List<Any?> -> if (null != it) {
                    flatList.add(it)
                }
                else -> flatList.addAll(flatten(it))
            }
        }
        return flatList
    }

}