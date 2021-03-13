package br.com.lohanna.digionebank

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal,
    val senha: String
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun calculoAuxilio() = salario * "0.4".toBigDecimal()

    override fun autentica(senha: String): Boolean = senha == this.senha

}