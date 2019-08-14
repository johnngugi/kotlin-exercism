class BankAccount {

    private var open: Boolean = true
    var balance: Int = 0
        get() {
            if (!open) {
                throw IllegalStateException()
            }
            return field
        }

    fun adjustBalance(amount: Int) {
        synchronized(this) {
            balance += amount
        }
    }

    fun close() {
        synchronized(this) {
            open = false
        }
    }

}