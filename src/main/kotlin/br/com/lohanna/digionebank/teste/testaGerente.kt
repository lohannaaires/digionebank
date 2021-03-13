package br.com.lohanna.digionebank.teste

import br.com.lohanna.digionebank.Gerente
import br.com.lohanna.digionebank.Login

fun testaLogin() {
    val lohanna = Gerente(
        nome = "Lohanna",
        cpf = "111.111.111-11",
        senha = "abc123",
        salario = "2000.00".toBigDecimal()
    )

    Login().acessa(lohanna, "abc123")
}