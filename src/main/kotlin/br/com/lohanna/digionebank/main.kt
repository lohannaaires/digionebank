package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.teste.testaAnalista
import br.com.lohanna.digionebank.teste.testaFuncionario
import br.com.lohanna.digionebank.teste.testaTipoCliente

fun main() {

    val lohanna = Gerente(
        nome = "Lohanna",
        cpf = "111.111.111-11",
        salario = "2000.00".toBigDecimal()
    )

    ImprimeRelatorioFuncionario.imprimeRelatorio(lohanna)

}





