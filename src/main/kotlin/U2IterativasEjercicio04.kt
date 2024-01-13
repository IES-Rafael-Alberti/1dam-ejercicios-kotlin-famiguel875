fun cuentaAtras(numero: Int) {
    val cuentaAtras = (numero downTo 0).map { it.toString() }
    val resultado = cuentaAtras.joinToString(", ")
    println(resultado)
}

fun u2iterativasejer04() {
    print("Ingrese un número entero positivo: ")
    val numero: Int? = readLine()?.toIntOrNull()

    if (numero != null && numero >= 0) {
        cuentaAtras(numero)
    } else {
        println("Por favor, ingrese un número entero positivo válido.")
    }
}
