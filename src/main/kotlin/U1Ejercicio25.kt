fun u1ejercicio25() {
    print("Ingrese su fecha de nacimiento en formato dd/mm/aaaa: ")
    val fecha: String? = readLine()

    if (!fecha.isNullOrBlank()) {
        val (dia, mes, anio) = fecha.split('/')

        println("Día: $dia")
        println("Mes: $mes")
        println("Año: $anio")
    } else {
        println("Por favor, ingrese una fecha válida.")
    }
}
