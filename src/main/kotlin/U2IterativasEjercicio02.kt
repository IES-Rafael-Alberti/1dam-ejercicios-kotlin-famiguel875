fun aniosCumplidos(edad: Int) {
    for (i in 1..edad) {
        println("Ha cumplido $i años.")
    }
}

fun u2iterativasejer02() {
    print("Ingrese su edad: ")
    val edad: Int? = readLine()?.toIntOrNull()

    if (edad != null) {
        aniosCumplidos(edad)
    } else {
        println("Por favor, ingrese una edad válida.")
    }
}
