class livros(livro : String, autor : String, colecao : String) {
    var livro = livro
    var autor = autor
    var colecao = colecao
    fun Livros(){
        println("livro : $livro")
        println("autor : $autor")
        println("colecao : $colecao")
    }
}

class emprestimo(Data_Recebimento : String, Data_Entrega : String) {
    var Data_Recebimento = Data_Recebimento
    var Data_Entrega = Data_Entrega

    fun Emprestimo(){
        println("Data de recebimento: $Data_Recebimento")
        println("Data de Devolução : $Data_Entrega")
    }
}

class cliente(nome : String, endereco : String) {
    var nome = nome
    var endereco = endereco

    fun Cliente(){
        println("Nome: $nome")
        println("Endereco : $endereco")
    }
}
