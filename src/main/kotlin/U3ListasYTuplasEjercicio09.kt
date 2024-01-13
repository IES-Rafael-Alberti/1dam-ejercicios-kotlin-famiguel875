fun u3listasytuplasejer09() {
    // Solicitar una palabra al usuario
    print("Ingresa una palabra: ")
    val palabra = readLine()?.lowercase()

    // Contar el número de veces que contiene cada vocal
    val conteoVocales = contarVocales(palabra)

    // Mostrar el resultado por pantalla
    println("Número de veces que contiene cada vocal:")
    for ((vocal, cantidad) in conteoVocales) {
        println("$vocal: $cantidad")
    }
}

fun contarVocales(palabra: String?): Map<Char, Int> {
    val conteo = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)

    if (palabra != null) {
        for (letra in palabra) {
            if (conteo.containsKey(letra)) {
                conteo[letra] = conteo[letra]!! + 1
            }
        }
    }

    return conteo
}
