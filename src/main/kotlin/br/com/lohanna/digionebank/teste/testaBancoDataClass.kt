package br.com.lohanna.digionebank.teste

import br.com.lohanna.digionebank.Banco

fun testaBancoDataClass() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    val copiaBanco = digiOneBank.copy(numero = 7)

    println("${copiaBanco.infoBanco()} \n")
    println(digiOneBank.infoBanco())
}