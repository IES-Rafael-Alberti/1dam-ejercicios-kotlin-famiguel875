fun u1ejercicio21() {
    print("Ingrese una frase: ")
    val frase: String? = readLine()

    if (!frase.isNullOrBlank()) {
        val fraseInvertida: String = frase.reversed()

        println("Frase invertida: $fraseInvertida")
    } else {
        println("Por favor, ingrese una frase válida.")
    }
}