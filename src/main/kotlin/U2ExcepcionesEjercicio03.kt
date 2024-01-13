fun obtenerCuentaAtras(numero: Int): String {
    if (numero < 0) {
        throw IllegalArgumentException("El número debe ser positivo.")
    }
    return (numero downTo 0).joinToString(", ")
}

fun u2excepcionesejer03() {
    while (true) {
        try {
            print("Ingrese un número entero positivo: ")
            val numero: Int = readLine()?.toIntOrNull() ?: 0

            val cuentaAtras: String = obtenerCuentaAtras(numero)
            println(cuentaAtras)
            break
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}
