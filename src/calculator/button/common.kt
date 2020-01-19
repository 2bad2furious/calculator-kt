package calculator.button

import calculator.calculation.Addition
import calculator.calculation.Division
import calculator.calculation.Multiplication
import calculator.calculation.Subtraction

object AdditionButton : IButton by CalculationButton(Addition)
object SubtractionButton : IButton by CalculationButton(Subtraction)
object MultiplicationButton : IButton by CalculationButton(Multiplication)
object DivisionButton : IButton by CalculationButton(Division)

object Number1Button : IButton by NumberButton(1)
object Number2Button : IButton by NumberButton(2)
object Number3Button : IButton by NumberButton(3)
object Number4Button : IButton by NumberButton(4)
object Number5Button : IButton by NumberButton(5)
object Number6Button : IButton by NumberButton(6)
object Number7Button : IButton by NumberButton(7)
object Number8Button : IButton by NumberButton(8)
object Number9Button : IButton by NumberButton(9)
object Number0Button : IButton by NumberButton(0)
