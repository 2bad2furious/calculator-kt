package calculator.button

import calculator.ICalculator

object ClearButton : IButton {
    override fun action(calculator: ICalculator) {
        calculator.currentOperandBuilder.clear()
    }
}
