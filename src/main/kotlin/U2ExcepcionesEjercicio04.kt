fun obtenerNumeroEntero(): Int {
    return try {
        print("Ingrese un número entero: ")
        readLine()?.toIntOrNull() ?: throw NumberFormatException("La entrada no es correcta. Por favor, ingrese un número entero.")
    } catch (e: NumberFormatException) {
        throw NumberFormatException("La entrada no es correcta. Por favor, ingrese un número entero.")
    }
}

fun u2excepcionesejer04() {
    try {
        val numero: Int = obtenerNumeroEntero()
        println("Ha ingresado el número $numero.")
    } catch (e: NumberFormatException) {
        println(e.message)
    }
}
