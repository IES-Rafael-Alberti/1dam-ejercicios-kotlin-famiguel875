fun u1ejercicio06() {
    print("Precio final de un artículo: ")
    val precioFinal: Float = readLine()?.toFloatOrNull() ?: 0.0f
    val tipoIVA: Int = 10

    val importeSinIVA: Float = calculoImporteSinIVA(precioFinal, tipoIVA)
    println("El importe sin IVA es de $importeSinIVA €")
}

fun calculoImporteSinIVA(precioFinal: Float, tipoIVA: Int): Float {
    val importeSinIVA: Float = precioFinal - (precioFinal * tipoIVA / 100)
    return importeSinIVA
}
