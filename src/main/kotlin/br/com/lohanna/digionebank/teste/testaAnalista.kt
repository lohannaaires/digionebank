package br.com.lohanna.digionebank.teste

import br.com.lohanna.digionebank.Analista
import br.com.lohanna.digionebank.ImprimeRelatorioFuncionario

fun testaAnalista() {
    val lohanna = Analista(
        nome = "Lohanna",
        cpf = "111.111.111-11",
        salario = "2000.00".toBigDecimal()
    )

    ImprimeRelatorioFuncionario.imprimeRelatorio(lohanna)
}