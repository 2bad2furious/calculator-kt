import calculator.Calculator
import calculator.ICalculator
import calculator.button.*
import java.util.*
import kotlin.properties.Delegates

class CLI(
    private val calculator: ICalculator = Calculator(),
    private val scanner: Scanner = Scanner(System.`in`),
    private val exitChar: Char = 'E',
    private val buttons: Map<Char, IButton> = mapOf(
        '0' to Number0Button,
        '1' to Number1Button,
        '2' to Number2Button,
        '3' to Number3Button,
        '4' to Number4Button,
        '5' to Number5Button,
        '6' to Number6Button,
        '7' to Number7Button,
        '8' to Number8Button,
        '9' to Number9Button,
        '.' to DecimalPointButton,
        '+' to AdditionButton,
        '-' to SubtractionButton,
        '*' to MultiplicationButton,
        '/' to DivisionButton,
        'C' to ClearButton,
        '=' to EqualsButton
    )
) {
    private val buttonOptions = buttons.keys.joinToString(", ")

    fun run() {
        var input by Delegates.notNull<Char>() //This thing is still annoying

        do {
            println("Button options are: $buttonOptions")
            println("Give me a button, or a set of them")
            input = scanner.nextChar()
            if (input != exitChar) {
                val button = buttons[input.toUpperCase()] ?: buttons[input.toLowerCase()]
                if (button == null) println("Button $input not found")
                else {
                    button.action(calculator)
                    calculator.lastResult?.let { println("Last result was $it") }
                    //TODO add lastResult + calculation symbol
                    println("All you see is ${beautify(calculator.currentOperandBuilder.build())}")
                }
            }
        } while (input != exitChar)
    }

    private fun beautify(d: Double): String {
        return if (kotlin.math.floor(d) == d) d.toInt().toString() else d.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            CLI().run()
        }
    }
}

