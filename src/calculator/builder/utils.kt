package calculator.builder


fun INumberBuilder.buildAndClear(): Double {
    return build().also { clear() }
}
