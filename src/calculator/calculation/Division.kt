package calculator.calculation

object Division : ICalculation {
    override fun calc(i1: Double, i2: Double): Double {
        return when (i2) {
            0.0 -> {
                println("Cannot divide by 0")
                i1
            }
            else -> i1 / i2
        }

    }
}
