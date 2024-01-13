fun u3diccionariosejer11() {
    val directorioClientes = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

    val clientes = parsearDirectorio(directorioClientes)

    println(clientes)
}

fun parsearDirectorio(directorio: String): Map<String, Map<String, Any>> {
    val lineas = directorio.split('\n')
    val campos = lineas[0].split(';')
    val clientes = mutableMapOf<String, Map<String, Any>>()

    for (i in 1 until lineas.size) {
        val valores = lineas[i].split(';')
        val cliente = mutableMapOf<String, Any>()

        for (j in campos.indices) {
            val campo = campos[j]
            val valor = valores[j]

            if (campo == "descuento") {
                cliente[campo] = valor.toDouble()
            } else {
                cliente[campo] = valor
            }
        }

        val nif = cliente["nif"] as String
        clientes[nif] = cliente
    }

    return clientes
}
