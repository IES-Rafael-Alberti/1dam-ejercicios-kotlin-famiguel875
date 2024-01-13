fun u3listasytuplasejer10() {
    // Lista de precios
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)

    // Obtener el menor y el mayor de los precios
    val menor = precios.minOrNull()
    val mayor = precios.maxOrNull()

    // Mostrar por pantalla el resultado
    if (menor != null && mayor != null) {
        println("Menor precio: $menor")
        println("Mayor precio: $mayor")
    } else {
        println("La lista de precios está vacía.")
    }
}
