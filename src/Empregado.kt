open class Empregado(nome: String, idade: Int, salario_fixo: Double) {
    var nome: String = nome
    var idade: Int = idade
    var salario_fixo: Double = salario_fixo

    fun dados(){
        println("nome do empregado: $nome")
        println("idade do empregado: $idade")
        println("salario: $salario_fixo")
    }

}

