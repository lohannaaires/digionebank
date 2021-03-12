package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.teste.testaTipoCliente

fun main() {

    val lohanna = Pessoa(
        nome = "Lohanna",
        cpf = "111.111.111-11"
    )

    val israel = Funcionario(
        nome = "Israel",
        cpf = "222.222.222-22",
        salario = "5000.00".toBigDecimal()
    )

    println("""
        Nome: ${lohanna.nome}
        CPF: ${lohanna.cpf}
        
    """.trimIndent())

    println("""
        Nome: ${israel.nome}
        CPF: ${israel.cpf}
        Salário: ${israel.salario}
    """.trimIndent())

}
