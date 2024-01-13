fun u3diccionariosejer10() {
    val baseDeDatosClientes = mutableMapOf<String, MutableMap<String, Any>>()

    do {
        println("\nMenú:")
        println("(1) Añadir cliente")
        println("(2) Eliminar cliente")
        println("(3) Mostrar cliente")
        println("(4) Listar todos los clientes")
        println("(5) Listar clientes preferentes")
        println("(6) Terminar")

        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                val cliente = leerDatosCliente()
                baseDeDatosClientes[cliente["NIF"] as String] = cliente
                println("Cliente añadido correctamente.")
            }
            2 -> {
                println("Ingrese el NIF del cliente a eliminar:")
                val nifEliminar = readLine()?.trim() ?: ""
                if (baseDeDatosClientes.containsKey(nifEliminar)) {
                    baseDeDatosClientes.remove(nifEliminar)
                    println("Cliente eliminado correctamente.")
                } else {
                    println("Cliente no encontrado.")
                }
            }
            3 -> {
                println("Ingrese el NIF del cliente a mostrar:")
                val nifMostrar = readLine()?.trim() ?: ""
                if (baseDeDatosClientes.containsKey(nifMostrar)) {
                    mostrarCliente(baseDeDatosClientes[nifMostrar]!!)
                } else {
                    println("Cliente no encontrado.")
                }
            }
            4 -> {
                if (baseDeDatosClientes.isEmpty()) {
                    println("No hay clientes en la base de datos.")
                } else {
                    println("\nLista de todos los clientes:")
                    baseDeDatosClientes.forEach { (_, cliente) -> mostrarCliente(cliente) }
                }
            }
            5 -> {
                val clientesPreferentes = baseDeDatosClientes.filterValues { it["preferente"] == true }
                if (clientesPreferentes.isEmpty()) {
                    println("No hay clientes preferentes en la base de datos.")
                } else {
                    println("\nLista de clientes preferentes:")
                    clientesPreferentes.forEach { (_, cliente) -> mostrarCliente(cliente) }
                }
            }
            6 -> {
                println("Terminando el programa.")
            }
            else -> {
                println("Opción no válida. Intente nuevamente.")
            }
        }

    } while (opcion != 6)
}

fun leerDatosCliente(): MutableMap<String, Any> {
    val cliente = mutableMapOf<String, Any>()

    println("\nIngrese los datos del cliente:")
    println("NIF:")
    cliente["NIF"] = readLine()?.trim() ?: ""

    println("Nombre:")
    cliente["nombre"] = readLine()?.trim() ?: ""

    println("Dirección:")
    cliente["direccion"] = readLine()?.trim() ?: ""

    println("Teléfono:")
    cliente["telefono"] = readLine()?.trim() ?: ""

    println("Correo:")
    cliente["correo"] = readLine()?.trim() ?: ""

    println("¿Es cliente preferente? (true/false):")
    cliente["preferente"] = readLine()?.toBoolean() ?: false

    return cliente
}

fun mostrarCliente(cliente: Map<String, Any>) {
    println("\nDatos del cliente:")
    println("NIF: ${cliente["NIF"]}")
    println("Nombre: ${cliente["nombre"]}")
    println("Dirección: ${cliente["direccion"]}")
    println("Teléfono: ${cliente["telefono"]}")
    println("Correo: ${cliente["correo"]}")
    println("Preferente: ${cliente["preferente"]}")
}