fun sumaDigitosEnteroCorteMenos1() {
    var pares = 0
    while (true) {
        print("Ingrese un número entero positivo (-1 para finalizar): ")
        val numero: Int = readLine()?.toIntOrNull() ?: 0

        if (numero == -1) {
            break
        }

        var sumaDigitos = 0
        var temp = numero
        while (temp > 0) {
            sumaDigitos += temp % 10
            temp /= 10
        }

        if (sumaDigitos % 2 == 0) {
            pares++
        }

        println("La suma de los dígitos de $numero es $sumaDigitos")
    }

    println("Se ingresaron $pares números con suma de dígitos par.")
}

fun u2iterativasejer18() {
    sumaDigitosEnteroCorteMenos1()
}
