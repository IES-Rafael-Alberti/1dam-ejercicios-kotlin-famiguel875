fun trianguloRectanguloNumeros(numero: Int) {
    for (i in 1..numero step 2) {
        var count = i
        while (count >= 1) {
            print("$count ")
            count -= 2
        }
        println()
    }
}

fun u2iterativasejer08() {
    print("Ingrese un número entero: ")
    val numero: Int? = readLine()?.toIntOrNull()

    if (numero != null) {
        trianguloRectanguloNumeros(numero)
    } else {
        println("Por favor, ingrese un número entero válido.")
    }
}
