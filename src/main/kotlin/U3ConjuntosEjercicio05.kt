fun encontrarInterseccion() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }.toSet()
    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()
    val paresYMultiplosDeTres = pares intersect multiplosDeTres

    println("Conjunto de pares: $pares")
    println("Conjunto de múltiplos de tres: $multiplosDeTres")
    println("Intersección entre pares y múltiplos de tres: $paresYMultiplosDeTres")
}

fun u3conjuntosejer05() {
    encontrarInterseccion()
}
