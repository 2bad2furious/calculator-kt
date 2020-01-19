package calculator.button

import calculator.ICalculator

class NumberButton(
    private val number: Int
) : IButton {

    private var str = "";
    override fun action(calculator: ICalculator) {
        calculator.currentOperandBuilder.addNumber(number)
    }
}
