fun u3listasytuplasejer06() {
    // Lista de asignaturas del curso
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

    // MutableMap para almacenar las notas de cada asignatura
    val notas = mutableMapOf<String, Double>()

    // Solicitar al usuario las notas para cada asignatura
    for (asignatura in asignaturas) {
        print("Ingresa la nota para $asignatura: ")
        val nota = readLine()?.toDoubleOrNull()

        if (nota != null) {
            notas[asignatura] = nota
        } else {
            println("La nota ingresada no es válida. Inténtalo de nuevo.")
            break
        }
    }

    // Filtrar las asignaturas aprobadas y mostrar las que deben repetirse
    val asignaturasRepetir = asignaturas.filter { notas[it] ?: 0.0 < 5.0 }

    // Mostrar el resultado
    println("\nAsignaturas que debes repetir:")
    if (asignaturasRepetir.isNotEmpty()) {
        asignaturasRepetir.forEach { println(it) }
    } else {
        println("¡Felicidades! Has aprobado todas las asignaturas.")
    }
}
