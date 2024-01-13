fun u1ejercicio18() {
    print("Ingrese su nombre completo: ")
    val nombreCompleto: String? = readLine()

    if (!nombreCompleto.isNullOrBlank()) {
        val nombreMin: String = nombreCompleto.lowercase()
        val nombreMay: String = nombreCompleto.uppercase()
        val nombreCaps: String = nombreCompleto.split(" ").joinToString(" ") { it.capitalize() }

        println("Nombre en minúsculas: $nombreMin")
        println("Nombre en mayúsculas: $nombreMay")
        println("Nombre con iniciales en mayúsculas: $nombreCaps")
    } else {
        println("Por favor, ingrese un nombre válido.")
    }
}