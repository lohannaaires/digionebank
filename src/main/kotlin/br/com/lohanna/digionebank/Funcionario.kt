package br.com.lohanna.digionebank

import java.math.BigDecimal

class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
): Pessoa(
    nome = nome,
    cpf = cpf
)