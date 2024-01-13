fun u3conjuntosejer02() {
    val nombresPrimaria = mutableListOf<String>()
    val nombresSecundaria = mutableListOf<String>()

    println("Introduce los nombres de los alumnos de primaria (escribe 'x' para finalizar):")
    solicitarNombres(nombresPrimaria)

    println("Introduce los nombres de los alumnos de secundaria (escribe 'x' para finalizar):")
    solicitarNombres(nombresSecundaria)

    val todosLosNombres = (nombresPrimaria + nombresSecundaria).distinct()
    println("\nNombres de todos los alumnos (sin repeticiones):")
    todosLosNombres.forEach { println(it) }

    val nombresRepetidos = nombresPrimaria.intersect(nombresSecundaria)
    println("\nNombres que se repiten entre primaria y secundaria:")
    nombresRepetidos.forEach { println(it) }

    val nombresNoRepetidosEnSecundaria = nombresPrimaria.subtract(nombresSecundaria)
    println("\nNombres de primaria que no se repiten en secundaria:")
    nombresNoRepetidosEnSecundaria.forEach { println(it) }

    val todosEnSecundaria = nombresPrimaria.all { it in nombresSecundaria }
    println("\n¿Todos los nombres de primaria están incluidos en secundaria?: $todosEnSecundaria")
}

fun solicitarNombres(nombres: MutableList<String>) {
    var nombre: String
    do {
        print("Introduce un nombre (o 'x' para finalizar): ")
        nombre = readLine() ?: ""
        if (nombre.lowercase() != "x") {
            nombres.add(nombre)
        }
    } while (nombre.lowercase() != "x")
}

