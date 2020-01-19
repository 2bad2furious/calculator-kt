package calculator.builder

interface INumberBuilder {

    fun addNumber(i: Int)

    /**
     * Adds dot to the number representing the decimal point
     *
     * @return whether it was added or not - false if it already contains it
     */
    fun addDecimalPoint(): Boolean

    val isEmpty: Boolean

    fun clear()

    fun build(): Double
}
