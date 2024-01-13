fun u1ejercicio27() {
    print("Ingrese el nombre del producto: ")
    val nombreProducto: String? = readLine()

    print("Ingrese el precio unitario del producto: ")
    val precioUnitario: Float? = readLine()?.toFloatOrNull()

    print("Ingrese el número de unidades: ")
    val unidades: Int? = readLine()?.toIntOrNull()

    if (nombreProducto != null && precioUnitario != null && unidades != null) {
        val costeTotal: Float = precioUnitario * unidades

        println("Producto: $nombreProducto")
        println("Precio unitario: %.2f".format(precioUnitario))
        println("Número de unidades: %03d".format(unidades))
        println("Coste total: %.2f".format(costeTotal))
    } else {
        println("Por favor, ingrese valores válidos.")
    }
}
