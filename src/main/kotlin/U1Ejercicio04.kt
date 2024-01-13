fun u1ejercicio04() {
    print("Introduzca la temperatura en grados Celsius: ")
    val gcelsius: Float = readLine()?.toFloatOrNull() ?: 0.0f

    val gfahrenheit: Float = calcularCelsiusAFahrenheit(gcelsius)
    println("La temperatura en Fahrenheit es de %.2f ºF".format(gfahrenheit))
}

fun calcularCelsiusAFahrenheit(gcelsius: Float): Float {
    val gfahrenheit: Float = (gcelsius * 9 / 5) + 32
    return gfahrenheit
}
