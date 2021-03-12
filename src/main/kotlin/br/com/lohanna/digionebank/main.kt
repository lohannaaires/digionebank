package br.com.lohanna.digionebank

fun main() {

    ClienteTipo.values().forEach { tipoCliente ->
        println("${tipoCliente.name} (${tipoCliente.descricao})")
    }

    ClienteTipo.values().forEach {
        println("${it.name} (${it.descricao})")
    }

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println("""
        >> ${pf.name} (${pf.descricao})
        >> ${pj.name} (${pj.descricao})
    """.trimIndent())

}
