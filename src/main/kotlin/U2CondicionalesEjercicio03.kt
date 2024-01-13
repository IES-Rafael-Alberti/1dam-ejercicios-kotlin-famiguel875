fun division(num1: Int, num2: Int) {
    if (num2 == 0) {
        println("ERROR")
    } else {
        println(num1.toDouble() / num2.toDouble())
    }
}

fun u2condicionalesejer03() {
    print("Introduzca el primer número: ")
    val num1: Int? = readLine()?.toIntOrNull()

    print("Introduzca el segundo número: ")
    val num2: Int? = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        division(num1, num2)
    } else {
        println("Por favor, introduzca números válidos.")
    }
}