fun mostrarCreditosAsignaturas() {
    val creditosAsignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var totalCreditos = 0

    for ((asignatura, creditos) in creditosAsignaturas) {
        println("$asignatura tiene $creditos créditos")
        totalCreditos += creditos
    }

    println("El número total de créditos del curso es: $totalCreditos")
}

fun u3diccionariosejer05() {
    mostrarCreditosAsignaturas()
}
