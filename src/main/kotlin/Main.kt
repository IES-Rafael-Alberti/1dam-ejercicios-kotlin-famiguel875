fun main() {

    var op: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)

}


fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> {
                println("1. U1 Ejercicio 04")
                println("2. U1 Ejercicio 06")
                println("3. U1 Ejercicio 12")
                println("4. U1 Ejercicio 15")
                println("5. U1 Ejercicio 18")
                println("6. U1 Ejercicio 20")
                println("7. U1 Ejercicio 21")
                println("8. U1 Ejercicio 22")
                println("9. U1 Ejercicio 24")
                println("10. U1 Ejercicio 25")
                println("11. U1 Ejercicio 26")
                println("12. U2 Ejercicio 27")

                op = pedirOpcion(0, 12)
                when (op) {
                    1 -> u1ejercicio04()
                    2 -> u1ejercicio06()
                    3 -> u1ejercicio12()
                    4 -> u1ejercicio15()
                    5 -> u1ejercicio18()
                    6 -> u1ejercicio20()
                    7 -> u1ejercicio21()
                    8 -> u1ejercicio22()
                    9 -> u1ejercicio24()
                    10 -> u1ejercicio25()
                    11 -> u1ejercicio26()
                    12 -> u1ejercicio27()
                }
            }

            2 -> {
                println("1. U2 Condicionales ejercicio 02")
                println("2. U2 Condicionales ejercicio 03")
                println("3. U2 Condicionales ejercicio 06")
                println("4. U2 Condicionales ejercicio 08")
                println("5. U2 Condicionales ejercicio 10")
                println("6. U2 Excepciones ejercicio 02")
                println("7. U2 Excepciones ejercicio 03")
                println("8. U2 Excepciones ejercicio 04")
                println("9. U2 Excepciones ejercicio 02")
                println("10. U2 Iterativas ejercicio 02")
                println("11. U2 Iterativas ejercicio 06")
                println("12. U2 Iterativas ejercicio 07")
                println("13. U2 Iterativas ejercicio 08")
                println("14. U2 Iterativas ejercicio 13")
                println("15. U2 Iterativas ejercicio 15")
                println("16. U2 Iterativas ejercicio 18")
                println("17. U2 Iterativas ejercicio 19")
                println("18. U2 Iterativas ejercicio 25")

                op = pedirOpcion(0, 18)
                when (op) {
                    1 -> u2condicionalesejer02()
                    2 -> u2condicionalesejer03()
                    3 -> u2condicionalesejer06()
                    4 -> u2condicionalesejer08()
                    5 -> u2condicionalesejer10()
                    6 -> u2excepcionesejer02()
                    7 -> u2excepcionesejer03()
                    8 -> u2excepcionesejer04()
                    9 -> u2iterativasejer02()
                    10 -> u2iterativasejer04()
                    11 -> u2iterativasejer06()
                    12 -> u2iterativasejer07()
                    13 -> u2iterativasejer08()
                    14 -> u2iterativasejer13()
                    15 -> u2iterativasejer15()
                    16 -> u2iterativasejer18()
                    17 -> u2iterativasejer19()
                    18 -> u2iterativasejer25()
                }
            }

            3 -> {
                println("1. U3 Conjuntos ejercicio 01")
                println("2. U3 Conjuntos ejercicio 02")
                println("3. U3 Conjuntos ejercicio 03")
                println("4. U3 Conjuntos ejercicio 04")
                println("5. U3 Conjuntos ejercicio 05")
                println("6. U3 Conjuntos ejercicio 06")
                println("7. U3 Diccionario ejercicio 03")
                println("8. U3 Diccionario ejercicio 05")
                println("9. U3 Diccionario ejercicio 06")
                println("10. U3 Diccionario ejercicio 07")
                println("11. U3 Diccionario ejercicio 08")
                println("12. U3 Diccionario ejercicio 10")
                println("13. U3 Diccionario ejercicio 11")
                println("14. U3 Listas y tuplas ejercicio 04")
                println("15. U3 Listas y tuplas ejercicio 06")
                println("16. U3 Listas y tuplas ejercicio 08")
                println("17. U3 Listas y tuplas ejercicio 09")
                println("18. U3 Listas y tuplas ejercicio 10")
                println("19. U3 Listas y tuplas ejercicio 13")

                op = pedirOpcion(0, 19)
                when (op) {
                    1 -> u3conjuntosejer01()
                    2 -> u3conjuntosejer02()
                    3 -> u3conjuntosejer03()
                    4 -> u3conjuntosejer04()
                    5 -> u3conjuntosejer05()
                    6 -> u3conjuntosejer06()
                    7 -> u3diccionariosejer03()
                    8 -> u3diccionariosejer05()
                    9 -> u3diccionariosejer06()
                    10 -> u3diccionariosejer07()
                    11 -> u3diccionariosejer08()
                    12 -> u3diccionariosejer10()
                    13 -> u3diccionariosejer11()
                    14 -> u3listasytuplasejer04()
                    15 -> u3listasytuplasejer06()
                    16 -> u3listasytuplasejer08()
                    17 -> u3listasytuplasejer09()
                    18 -> u3listasytuplasejer10()
                    19 -> u3listasytuplasejer13()
                }
            }
        }
    } while (op != 0)

}

/**
 * Pedir una opción del menú
 * @param min Int - opción mínima
 * @param max Int - opción máxima
 */
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> {
            println("**Error desconocido**")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..10) {
        println()
    }
}

