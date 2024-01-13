fun ingresarSalir() {
    while (true) {
        print("Ingrese algo (o 'salir' para terminar): ")
        val entrada: String? = readLine()

        if (entrada?.lowercase() == "salir") {
            break
        }

        println(entrada)
    }
}

fun u2iterativasejer13() {
    ingresarSalir()
}
