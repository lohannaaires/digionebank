package br.com.lohanna.digionebank

import br.com.lohanna.digionebank.Autenticavel

class Login {
    fun acessa(autenticavel: Autenticavel, senha: String) {
        if(autenticavel.autentica(senha)) {
           println("Seja bem-vind@!")
        } else {
            println("Senha incorreta. Tente novamente.")
        }
    }
}