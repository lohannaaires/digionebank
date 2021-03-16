package br.com.lohanna.digionebank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    var saldo: BigDecimal
) {

    fun deposito(valor: BigDecimal) {
        this.saldo += valor
    }

    fun saque(valor: BigDecimal) {
        if(this.saldo <= valor) {
            this.saldo -= valor
            println("Saque realizado com sucesso!")
        } else {
            println("Saldo insuficiente.")
        }
    }

}