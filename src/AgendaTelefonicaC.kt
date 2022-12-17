open class AgendaTelefonicaC(endereco: String, telefone : String, CEP : String) {
    var endereco = endereco
    var telefone = telefone
    var CEP = CEP

    fun Agenda(){
        println("Endereco: $endereco")
        println("telefone: $telefone")
        println("CEP: $CEP")
    }
}