fun rendimiento(puntuacion: Double) {
    when {
        puntuacion == 0.0 -> println("Su nivel de rendimiento es: Inaceptable y la cantidad de dinero que recibirá es: 0 €")
        puntuacion == 0.4 -> println("Su nivel de rendimiento es: Aceptable y la cantidad de dinero que recibirá es: 2400 €")
        puntuacion >= 0.6 -> println("Su nivel de rendimiento es: Meritorio y la cantidad de dinero que recibirá es: ${puntuacion * 2400} €")
        else -> println("Valor de puntuación erróneo")
    }
}

fun u2condicionalesejer08() {
    print("Ingrese su puntuación: ")
    val puntuacion: Double? = readLine()?.toDoubleOrNull()

    if (puntuacion != null) {
        rendimiento(puntuacion)
    } else {
        println("Por favor, ingrese una puntuación válida.")
    }
}
