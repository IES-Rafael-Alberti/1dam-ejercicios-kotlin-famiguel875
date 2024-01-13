data class Compra(val cliente: String, val dia: Int, val monto: Double, val domicilio: String)

fun obtenerDomiciliosParaFacturas(compras: List<Compra>): Map<String, List<String>> {
    // Crear un mapa mutable para almacenar los domicilios únicos por cliente
    val domiciliosPorCliente = mutableMapOf<String, MutableList<String>>()

    // Iterar sobre la lista de compras y agregar los domicilios únicos al mapa
    for (compra in compras) {
        val cliente = compra.cliente
        val domicilio = compra.domicilio

        // Obtener la lista de domicilios del cliente actual, o crear una nueva si no existe
        val listaDomicilios = domiciliosPorCliente.getOrPut(cliente) { mutableListOf() }

        // Agregar el domicilio a la lista si aún no está presente
        if (!listaDomicilios.contains(domicilio)) {
            listaDomicilios.add(domicilio)
        }
    }

    // Devolver el mapa resultante
    return domiciliosPorCliente
}

fun u3conjuntosejer01() {
    val compras = listOf(
        Compra("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        Compra("Jorge Russo", 7, 699.0, "Mirasol 218"),
        Compra("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        Compra("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        Compra("Jorge Russo", 15, 958.0, "Mirasol 218")
    )

    val domiciliosPorCliente = obtenerDomiciliosParaFacturas(compras)

    println("Domicilios para enviar facturas por cliente:")
    domiciliosPorCliente.forEach { (cliente, domicilios) ->
        println("$cliente: ${domicilios.joinToString(", ")}")
    }
}

