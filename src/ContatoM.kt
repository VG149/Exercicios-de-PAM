import Contato

fun main(){
    val C = Contato("Rua X","0000-0000","000000-00","Joao","SP","SP","Medico")
    val M = Contato("Rua Y","0000-0000","000000-00","Pedro","SP","SP","Bombeiro")

    println("Cliente 1")
    println(" ")
    M.contato()
    println(" ")
    println("Cliente 2")
    println(" ")
    C.contato()
}