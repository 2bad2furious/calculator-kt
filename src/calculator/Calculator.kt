package calculator

import calculator.builder.INumberBuilder
import calculator.builder.StringNumberBuilder
import calculator.calculation.ICalculation

data class Calculator(
    override var lastResult: Double? = null,
    override var calculation: ICalculation? = null,
    override var currentOperandBuilder: INumberBuilder = StringNumberBuilder()
) : ICalculator
