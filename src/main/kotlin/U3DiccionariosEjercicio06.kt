fun u3diccionariosejer06() {
    val informacionPersona = mutableMapOf<String, String>()

    while (true) {
        print("Ingrese el tipo de información (o 'fin' para terminar): ")
        val clave = readLine()?.trim() ?: ""

        if (clave.lowercase() == "fin") {
            break
        }

        print("Ingrese el valor para $clave: ")
        val valor = readLine()?.trim() ?: ""

        informacionPersona[clave] = valor

        println("Contenido del diccionario: $informacionPersona")
    }
}

