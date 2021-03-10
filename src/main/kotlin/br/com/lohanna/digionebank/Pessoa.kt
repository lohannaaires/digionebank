package br.com.lohanna.digionebank

class Pessoa (nome: String, cpf: String) {

    val nome: String = nome
    private val cpf: String = cpf
    var telefone: String = ""
        private set

    fun alteraTelefone(telefone: String) {
        this.telefone = telefone
    }

    fun infoPessoa() = """
        Nome: $nome
        CPF: $cpf
        Telefone: $telefone        
    """.trimIndent()
}