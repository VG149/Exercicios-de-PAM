class desenvolvedor_web(nome: String, idade: Int, salario_fixo: Double) : Empregado(nome, idade, salario_fixo, ) {

    fun desenvolvedor_web(){
        dados()
        println("Faz Web")
    }
}
class desenvolvedor_Android(nome: String, idade: Int, salario_fixo: Double) : Empregado(nome, idade, salario_fixo, ) {
    fun desenvolvedor(){
        dados()
        println("Faz Android")
    }
}
class desenvolvedor_kotlin(nome: String, idade: Int, salario_fixo: Double) : Empregado(nome, idade, salario_fixo, ) {
    fun desenvolvedor(){
        dados()
        println("Faz Kotlin")
    }
}