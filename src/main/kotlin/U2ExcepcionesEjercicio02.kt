fun obtenerImparesHastaN(numero: Int): List<String> {
    if (numero <= 0) {
        throw IllegalArgumentException("El número debe ser positivo.")
    }
    return (1..numero).filter { it % 2 != 0 }.map { it.toString() }
}

fun u2excepcionesejer02() {
    try {
        print("Ingrese un número entero positivo: ")
        val numero: Int = readLine()?.toIntOrNull() ?: 0

        val impares: List<String> = obtenerImparesHastaN(numero)
        println(impares.joinToString(", "))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}