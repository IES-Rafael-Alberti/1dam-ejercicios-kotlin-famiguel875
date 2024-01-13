fun u3listasytuplasejer08() {
    // Solicitar una palabra al usuario
    print("Ingresa una palabra: ")
    val palabra = readLine()?.lowercase()

    // Verificar si la palabra es un palíndromo
    if (palabra != null && esPalindromo(palabra)) {
        println("$palabra es un palíndromo.")
    } else {
        println("$palabra no es un palíndromo.")
    }
}

fun esPalindromo(palabra: String): Boolean {
    val palabraLimpia = palabra.replace("\\s".toRegex(), "")
    val longitud = palabraLimpia.length

    for (i in 0 until longitud / 2) {
        if (palabraLimpia[i] != palabraLimpia[longitud - i - 1]) {
            return false
        }
    }
    return true
}
