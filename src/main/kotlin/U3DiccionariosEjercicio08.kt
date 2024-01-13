fun u3diccionariosejer08() {
    val diccionario = mutableMapOf<String, String>()

    println("Ingrese las palabras en español e inglés (palabra:traducción), separadas por comas (por ejemplo, perro:dog, gato:cat):")
    val entrada = readLine()?.trim() ?: ""

    val paresPalabras = entrada.split(",").map { it.trim() }

    for (par in paresPalabras) {
        val partes = par.split(":")
        if (partes.size == 2) {
            val palabraEsp = partes[0].trim()
            val palabraIng = partes[1].trim()
            diccionario[palabraEsp] = palabraIng
        }
    }

    println("Diccionario creado: $diccionario")

    println("\nIngrese una frase en español para traducir:")
    val fraseEsp = readLine()?.trim() ?: ""

    val palabras = fraseEsp.split("\\s+".toRegex())

    println("\nFrase traducida:")
    for (palabra in palabras) {
        val palabraTraducida = diccionario[palabra] ?: palabra
        print("$palabraTraducida ")
    }
}
