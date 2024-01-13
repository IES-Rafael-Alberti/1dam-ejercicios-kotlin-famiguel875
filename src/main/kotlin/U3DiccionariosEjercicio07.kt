fun u3diccionariosejer07() {
    val listaCompra = mutableMapOf<String, Double>()

    while (true) {
        print("Ingrese el artículo (o 'fin' para terminar): ")
        val articulo = readLine()?.trim() ?: ""

        if (articulo.lowercase() == "fin") {
            break
        }

        print("Ingrese el precio de $articulo: ")
        val precio = readLine()?.toDoubleOrNull() ?: 0.0

        listaCompra[articulo] = precio

        println("Contenido de la lista de la compra: $listaCompra")
    }

    println("\nLista de la compra:")
    var totalCoste = 0.0
    for ((articulo, precio) in listaCompra) {
        println("$articulo\t$precio")
        totalCoste += precio
    }

    println("\nCoste total: $totalCoste")
}
