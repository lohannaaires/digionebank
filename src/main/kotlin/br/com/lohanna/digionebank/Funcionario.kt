package br.com.lohanna.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
): Pessoa(
    nome = nome,
    cpf = cpf
) {
    protected abstract fun calculoAuxilio(): BigDecimal

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}
    """.trimIndent()
}