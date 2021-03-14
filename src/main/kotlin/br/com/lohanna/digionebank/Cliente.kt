package br.com.lohanna.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(
    nome = nome,
    cpf = cpf
), Autenticavel {

    override fun autentica(senha: String): Boolean = senha == this.senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo de cliente: ${clienteTipo.name} (${clienteTipo.descricao})
    """.trimIndent()
}