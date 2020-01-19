package calculator.button

import calculator.ICalculator
import calculator.builder.buildAndClear

object EqualsButton : IButton {
    override fun action(calculator: ICalculator) {
        with(calculator) {
            val lastResult = lastResult
            val calculation = calculation
            calculator.lastResult = when {
                lastResult == null || calculation == null -> currentOperandBuilder.buildAndClear()
                // TODO fix case, where equals is ran multiple times, it should run the calculation with the same second parameter but updated first one
                else -> calculation.calc(lastResult, currentOperandBuilder.buildAndClear())
            }
        }
    }
}
