fun u1ejercicio24() {
    print("Ingrese el precio del producto en euros con dos decimales: ")
    val precio: Float? = readLine()?.toFloatOrNull()

    if (precio != null) {
        val euros: Int = precio.toInt()
        val centimos: Int = ((precio - euros) * 100).toInt()

        println("Euros: $euros")
        println("Céntimos: $centimos")
    } else {
        println("Por favor, ingrese un precio válido.")
    }
}