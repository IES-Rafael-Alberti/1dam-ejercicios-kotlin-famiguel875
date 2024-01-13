fun u3listasytuplasejer04() {
    val numerosGanadores = mutableListOf<Int>()

    println("Ingrese los números ganadores de la lotería primitiva (ingrese '0' para finalizar):")

    // Bucle para ingresar los números, se detiene cuando se ingresa '0'
    var numero: Int
    do {
        print("Número (0 para finalizar): ")
        numero = readLine()?.toIntOrNull() ?: 0

        if (numero != 0) {
            numerosGanadores.add(numero)
        }
    } while (numero != 0)

    // Ordenar la lista de números ganadores
    numerosGanadores.sort()

    // Mostrar los números ganadores ordenados
    println("Números ganadores ordenados:")
    for (num in numerosGanadores) {
        println(num)
    }
}
