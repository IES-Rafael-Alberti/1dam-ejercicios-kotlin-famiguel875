fun conjuntoPotencia(conjuntoOriginal: Set<Int>): List<Set<Int>> {
    val potencia = mutableListOf<Set<Int>>(setOf())

    for (elemento in conjuntoOriginal) {
        val nuevosSubconjuntos = mutableListOf<Set<Int>>()

        for (subconjunto in potencia) {
            nuevosSubconjuntos.add(subconjunto + elemento)
        }

        potencia.addAll(nuevosSubconjuntos)
    }

    return potencia
}

fun u3conjuntosejer03() {
    val conjuntoOriginal = setOf(6, 1, 4)
    val potencia = conjuntoPotencia(conjuntoOriginal)
    println(potencia)
}
