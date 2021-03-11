package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.teste.testaModificadoresDeVisibilidade
import br.com.lohanna.digionebank.teste.testaProperties

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    val copiaBanco = digiOneBank.copy(numero = 7)

    println("${copiaBanco.infoBanco()} \n")
    println(digiOneBank.infoBanco())

}
