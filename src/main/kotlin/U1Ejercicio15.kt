import java.util.Scanner

fun u1ejercicio15() {
    val scanner = Scanner(System.`in`)

    // Lee la cantidad de dinero depositada en la cuenta de ahorros
    print("Ingrese la cantidad de dinero depositada en la cuenta de ahorros: ")
    val capital = scanner.nextDouble()

    // Tasa de interés del 4% al año
    val interesAnual = 0.04

    // Calcula y muestra los ahorros tras el primer, segundo y tercer año
    for (i in 1..3) {
        val nuevoCapital = calcularNuevoCapital(capital, interesAnual, i)
        println("Después del año $i, la cantidad de ahorros es: \$${formatDecimal(nuevoCapital)}")
    }
}

fun calcularNuevoCapital(capital: Double, interesAnual: Double, anios: Int): Double {
    return capital * Math.pow(1.0 + interesAnual, anios.toDouble())
}

fun formatDecimal(valor: Double): String {
    // Redondea el valor a dos decimales y lo convierte a cadena
    return String.format("%.2f", valor)
}
