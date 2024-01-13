fun grupoAoB(nombre: String, sexo: String) {
    if ((sexo == "M" && nombre < "M") || (sexo == "H" && nombre > "N")) {
        println("Usted pertenece al grupo: A")
    } else {
        println("Usted pertenece al grupo: B")
    }
}

fun u2condicionalesejer06() {
    print("Ingrese su nombre: ")
    val nombre: String? = readLine()

    print("Ingrese su sexo (M para mujer, H para hombre): ")
    val sexo: String? = readLine()

    if (!nombre.isNullOrBlank() && !sexo.isNullOrBlank()) {
        grupoAoB(nombre, sexo)
    } else {
        println("Por favor, ingrese un nombre y un sexo válidos.")
    }
}
