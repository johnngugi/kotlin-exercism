class Triangle(private val a: Number, private val b: Number, private val c: Number) {

    init {
        require(a.toDouble() + b.toDouble() > c.toDouble() &&
                a.toDouble() + c.toDouble() > b.toDouble() &&
                b.toDouble() + c.toDouble() > a.toDouble())
    }

    val isEquilateral: Boolean
        get() = a == b && b == c

    val isIsosceles: Boolean
        get() = a == b || b == c || a == c

    val isScalene: Boolean
        get() = a != b && b != c

}