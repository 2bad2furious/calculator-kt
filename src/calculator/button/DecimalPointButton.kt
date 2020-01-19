package calculator.button

import calculator.ICalculator

object DecimalPointButton: IButton {
    override fun action(calculator: ICalculator) {
        if(!calculator.currentOperandBuilder.addDecimalPoint())
            println("point is already there")
    }
}
