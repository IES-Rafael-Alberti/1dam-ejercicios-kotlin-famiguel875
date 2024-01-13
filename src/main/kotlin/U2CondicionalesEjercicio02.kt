fun comprobarContrasenia(password1: String, password2: String) {
    if (password1.uppercase() == password2.uppercase()) {
        println("Contraseña correcta")
    } else {
        println("Contraseña errónea")
    }
}

fun u2condicionalesejer02() {
    print("Introduzca la contraseña: ")
    val password1: String? = readLine()
    val password2: String = "contraseña"

    if (!password1.isNullOrBlank()) {
        comprobarContrasenia(password1, password2)
    } else {
        println("Por favor, introduzca una contraseña válida.")
    }
}
