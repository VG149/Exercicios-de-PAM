

class Contato(endereco : String, telefone : String, CEP : String, nome : String, cidade : String, estado : String, profissao: String) : AgendaTelefonicaC(endereco, telefone, CEP) {
    var nome = nome
    var cidade = cidade
    var estado = estado
    var profissao = profissao
    fun contato() {
        println("nome: $nome")
        println("cidade: $cidade")
        println("estado: $estado")
        println("profissao: $profissao")
        Agenda()
    }
}