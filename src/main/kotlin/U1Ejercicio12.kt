fun u1ejercicio12() {
    print("¿Cuál es tu peso en kilogramos? ")
    val peso: Float = readLine()?.toFloatOrNull() ?: 0.0f

    print("¿Cuál es tu altura en metros? ")
    val estatura: Float = readLine()?.toFloatOrNull() ?: 0.0f

    val imc: Float = calcularIMC(peso, estatura)
    println("Tu índice de masa corporal, redondeado a dos decimales, es de %.2f".format(imc))
}

fun calcularIMC(peso: Float, estatura: Float): Float {
    val imc: Float = peso / (estatura * estatura)
    return imc
}
