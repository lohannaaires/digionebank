package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.teste.testaBancoDataClass
import br.com.lohanna.digionebank.teste.testaModificadoresDeVisibilidade
import br.com.lohanna.digionebank.teste.testaProperties

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
