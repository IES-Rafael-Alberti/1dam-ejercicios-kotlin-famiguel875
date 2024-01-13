fun u1ejercicio20() {
    print("Ingrese un número de teléfono en formato +34-xxxxxxxxx-xx: ")
    val telefono: String? = readLine()

    if (!telefono.isNullOrBlank() && telefono.length >= 14) {
        val numero: String = telefono.substring(4, 13)

        println("Número de teléfono sin prefijo y extensión: $numero")
    } else {
        println("Por favor, ingrese un número de teléfono válido en el formato especificado.")
    }
}