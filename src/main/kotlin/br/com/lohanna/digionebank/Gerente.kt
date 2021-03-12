package br.com.lohanna.digionebank

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun calculoAuxilio() = salario * "0.4".toBigDecimal()

}