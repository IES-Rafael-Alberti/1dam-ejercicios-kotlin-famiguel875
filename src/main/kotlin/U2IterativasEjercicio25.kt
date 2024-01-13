fun analizaFrases() {
    print("Ingrese una frase: ")
    val frase: String? = readLine()

    if (!frase.isNullOrBlank()) {
        val palabras = frase.split(" ")
        val palabraMasLarga = palabras.maxByOrNull { it.length }
        val cantidadPalabras = palabras.size
        println("La palabra más larga es '$palabraMasLarga' y hay $cantidadPalabras palabras en total.")
    } else {
        println("La frase ingresada no es válida.")
    }
}

fun u2iterativasejer25() {
    analizaFrases()
}
