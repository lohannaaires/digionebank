package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.teste.testaProperties

fun main() {
    val lohanna = Pessoa(nome = "Lohanna", cpf = "111.111.111-11")

    println("${lohanna.infoPessoa()} \n")

    lohanna.alteraTelefone("(99)99999-9999")

    println(lohanna.infoPessoa())
}