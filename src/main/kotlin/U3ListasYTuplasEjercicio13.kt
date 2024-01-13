import kotlin.math.pow
import kotlin.math.sqrt

fun u3listasytuplasejer13() {
    // Solicitar al usuario una muestra de números
    println("Ingrese una muestra de números separados por comas:")
    val entrada = readLine()

    // Verificar si la entrada no es nula y no está vacía
    if (!entrada.isNullOrBlank()) {
        // Convertir la entrada en una lista de números
        val numeros = entrada.split(',').map { it.trim().toDoubleOrNull() }

        // Filtrar los números no nulos
        val numerosValidos = numeros.filterNotNull()

        // Calcular la media
        val media = numerosValidos.average()

        // Calcular la desviación típica
        val desviacionTipica = calcularDesviacionTipica(numerosValidos, media)

        // Mostrar por pantalla los resultados
        println("Media: $media")
        println("Desviación Típica: $desviacionTipica")
    } else {
        println("Entrada inválida.")
    }
}

fun calcularDesviacionTipica(numeros: List<Double>, media: Double): Double {
    val sumatoriaCuadrados = numeros.map { (it - media).pow(2) }.sum()
    return sqrt(sumatoriaCuadrados / numeros.size)
}
