fun u1ejercicio26() {
    print("Ingrese los productos de la cesta de compra separados por comas: ")
    val productos: String? = readLine()

    if (!productos.isNullOrBlank()) {
        val productosLista: List<String> = productos.split(',').map { it.trim() }

        for (producto in productosLista) {
            println(producto)
        }
    } else {
        println("Por favor, ingrese al menos un producto.")
    }
}