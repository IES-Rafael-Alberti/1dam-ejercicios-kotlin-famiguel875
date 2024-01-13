fun trianguloRectanguloAsteriscos(altura: Int) {
    for (i in 1..altura) {
        println("*".repeat(i))
    }
}

fun u2iterativasejer06() {
    print("Ingrese un número entero: ")
    val altura: Int? = readLine()?.toIntOrNull()

    if (altura != null) {
        trianguloRectanguloAsteriscos(altura)
    } else {
        println("Por favor, ingrese un número entero válido.")
    }
}
