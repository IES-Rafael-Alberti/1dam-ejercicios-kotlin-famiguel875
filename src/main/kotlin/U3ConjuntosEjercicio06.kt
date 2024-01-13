fun conjuntosLetras() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val alfabeto = ('a'..'z').toSet()
    val consonantes = alfabeto - vocales
    val letrasComunes = vocales intersect consonantes

    println("Conjunto de consonantes: $consonantes")
    println("Letras comunes entre vocales y consonantes: $letrasComunes")
}

fun u3conjuntosejer06() {
    conjuntosLetras()
}
