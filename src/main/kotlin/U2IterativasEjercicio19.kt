fun menu123() {
    val notas = mutableListOf<Double>()

    while (true) {
        println("MENÚ")
        println("----")
        println("1 - Introduzca una nota")
        println("2 - Imprimir listado")
        println("3 - Finalizar programa")

        print("Seleccione una opción => ")
        val opcion: String? = readLine()

        when (opcion) {
            "1" -> {
                print("Introduzca una nota: ")
                val nota: Double = readLine()?.toDoubleOrNull() ?: 0.0
                notas.add(nota)
                println("Nota $nota añadida correctamente.")
            }
            "2" -> {
                if (notas.isEmpty()) {
                    println("No se han ingresado notas aún.")
                } else {
                    println("Listado de notas:")
                    notas.forEachIndexed { index, nota ->
                        println("Nota ${index + 1}: $nota")
                    }
                }
            }
            "3" -> {
                println("Finalizando programa.")
                return
            }
            else -> {
                println("Opción incorrecta. Por favor, elija una opción válida.")
            }
        }
    }
}

fun u2iterativasejer19() {
    menu123()
}
