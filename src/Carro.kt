

open class carro() {

        val cor: String = readLine()!!
        val modelo: String = "fiat"

        fun ligar() {
            println("ligando")
        }
        fun correr() {
        println("andando")
    }
        fun desligar(){
            println("Desligando")
        }

    }
    fun main() {
    val c = carro()

        c.cor
        c.modelo
        c.ligar()
        c.correr()
        c.desligar()

    }