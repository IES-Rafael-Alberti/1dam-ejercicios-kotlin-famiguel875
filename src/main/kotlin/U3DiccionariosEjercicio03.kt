fun obtenerPrecioFruta() {
    val preciosFrutas = mapOf("Plátano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    print("Ingrese el nombre de la fruta: ")
    val fruta = readLine()

    if (fruta != null && fruta in preciosFrutas) {
        print("Ingrese el número de kilos: ")
        val kilos = readLine()?.toDoubleOrNull()

        if (kilos != null) {
            val precioTotal = preciosFrutas[fruta]!! * kilos
            println("El precio de $kilos kilos de $fruta es: $precioTotal euros")
        } else {
            println("Por favor, ingrese un número válido de kilos.")
        }
    } else {
        println("La fruta no está en el diccionario.")
    }
}

fun u3diccionariosejer03() {
    obtenerPrecioFruta()
}
