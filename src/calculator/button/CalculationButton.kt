package calculator.button

import calculator.ICalculator
import calculator.builder.buildAndClear
import calculator.calculation.ICalculation

class CalculationButton(
    private val calculation: ICalculation
) : IButton {

    override fun action(calculator: ICalculator) {
        with(calculator) {
            val lastResult = lastResult
            val lastCalculation = this.calculation

            calculator.lastResult = when {
                //first operation
                lastResult == null -> currentOperandBuilder.buildAndClear()
                //first button after an operation is another operation, just change it, do nothing else
                //bs case where we have lastResult but dont have a calculation to run
                currentOperandBuilder.isEmpty || lastCalculation == null -> lastResult
                //calculate new lastResult
                else -> {
                    val i2 = currentOperandBuilder.buildAndClear()
                    lastCalculation.calc(lastResult, i2)
                }
            }
        }
        calculator.calculation = calculation
    }
}
