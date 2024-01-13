fun compararFrutas() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val frutasComunes = setFrutas1 intersect setFrutas2
    val frutasSoloEnFrutas1 = setFrutas1 - setFrutas2
    val frutasSoloEnFrutas2 = setFrutas2 - setFrutas1

    println("Frutas comunes: $frutasComunes")
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}

fun u3conjuntosejer04() {
    compararFrutas()
}
