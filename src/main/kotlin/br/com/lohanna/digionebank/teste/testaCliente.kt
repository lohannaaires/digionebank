package br.com.lohanna.digionebank.teste

import br.com.lohanna.digionebank.Cliente
import br.com.lohanna.digionebank.ClienteTipo
import br.com.lohanna.digionebank.Login

fun testaCliente() {
    val lohanna = Cliente(
        nome = "Lohanna",
        cpf = "111.111.111-11",
        senha = "abc123",
        clienteTipo = ClienteTipo.PF
    )

    println("$lohanna \n")

    Login().acessa(lohanna, "12345")
}