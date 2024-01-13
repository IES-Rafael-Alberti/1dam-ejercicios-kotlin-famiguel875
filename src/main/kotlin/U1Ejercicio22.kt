fun u1ejercicio22() {
    print("Ingrese una frase: ")
    val frase: String? = readLine()

    print("Ingrese una vocal: ")
    val vocal: String? = readLine()

    if (!frase.isNullOrBlank() && !vocal.isNullOrBlank() && vocal.length == 1) {
        val fraseModificada: String = frase.replace(vocal, vocal.uppercase())

        println("Frase con la vocal en mayúscula: $fraseModificada")
    } else {
        println("Por favor, ingrese una frase y una vocal válida.")
    }
}
