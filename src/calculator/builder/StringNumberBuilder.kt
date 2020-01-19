package calculator.builder

class StringNumberBuilder(
    private val strB: StringBuilder = StringBuilder()
) : INumberBuilder {

    override fun addNumber(i: Int) {
        if (strB.length != 1 || strB.first() != '0') strB.append(i)
        else if (i != 0) {
            strB.clear()
            strB.append(i)
        }
    }

    override fun addDecimalPoint(): Boolean {
        return when {
            strB.contains('.') -> false
            else -> {
                strB.append('.')
                true
            }
        }
        //return !strB.contains('.') && true.also { strB.append('.') } damn, thats ugly
    }

    override val isEmpty: Boolean get() = strB.isEmpty()

    override fun clear() {
        strB.clear()
    }

    override fun build(): Double {
        return if (isEmpty) 0.0 else strB.toString().toDouble()
    }

    override fun toString(): String = strB.toString()
}
