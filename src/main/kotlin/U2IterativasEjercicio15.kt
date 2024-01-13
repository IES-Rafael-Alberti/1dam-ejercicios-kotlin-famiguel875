fun sumatorioEnteros() {
    var total = 0
    while (true) {
        print("Ingrese un número (0 para finalizar): ")
        val numero: Int = readLine()?.toIntOrNull() ?: 0

        if (numero == 0) {
            break
        }

        if (numero > 0) {
            total += numero
        }
    }
    println("La sumatoria de los números positivos ingresados es: $total")
}

fun u2iterativasejer15() {
    sumatorioEnteros()
}
