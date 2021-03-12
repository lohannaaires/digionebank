package br.com.lohanna.digionebank

data class Banco(val nome: String, val numero: Int) {

    fun infoBanco() = """
        Nome: $nome
        Número: $numero
    """.trimIndent()

}
