package calculator

import calculator.builder.INumberBuilder
import calculator.calculation.ICalculation

interface ICalculator {
    var lastResult: Double?

    val currentOperandBuilder: INumberBuilder

    var calculation: ICalculation?
}

