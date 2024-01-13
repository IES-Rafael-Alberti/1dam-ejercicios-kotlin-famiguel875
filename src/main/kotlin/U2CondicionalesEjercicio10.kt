fun pizzaVegetariana(opcion: String) {
    if (opcion.lowercase() == "sí" || opcion.lowercase() == "si") {
        print("¿Quiere un ingrediente adicional? (Presione el número indicado si lo desea)\n1 -> pimiento\n2 -> tofu\n")
        val ingredienteAdicional: Int = readLine()?.toIntOrNull() ?: 0

        val ingredientes: List<String> = when (ingredienteAdicional) {
            1 -> listOf("mozzarella", "tomate", "pimiento")
            2 -> listOf("mozzarella", "tomate", "tofu")
            else -> listOf("mozzarella", "tomate")
        }

        val ingredientesString: String = ingredientes.joinToString(", ")
        println("Su pizza es vegetariana y sus ingredientes son: $ingredientesString")
    } else {
        print("¿Quiere un ingrediente adicional? (Presione el número indicado si lo desea)\n1 -> peperoni\n2 -> jamón\n3 -> salmón\n")
        val ingredienteAdicional: Int = readLine()?.toIntOrNull() ?: 0

        val ingredientes: List<String> = when (ingredienteAdicional) {
            1 -> listOf("mozzarella", "tomate", "peperoni")
            2 -> listOf("mozzarella", "tomate", "jamón")
            3 -> listOf("mozzarella", "tomate", "salmón")
            else -> listOf("mozzarella", "tomate")
        }

        val ingredientesString: String = ingredientes.joinToString(", ")
        println("Su pizza no es vegetariana y sus ingredientes son: $ingredientesString")
    }
}

fun u2condicionalesejer10() {
    print("¿Quiere una pizza vegetariana? (Sí/No): ")
    val opcion: String? = readLine()

    if (!opcion.isNullOrBlank()) {
        pizzaVegetariana(opcion)
    } else {
        println("Por favor, ingrese una opción válida.")
    }
}
