fun main() {


    for(i in 0 until 11) {
        println("insira uma nota de 0 a 10")
        var a: Int = readLine()!!.toInt()

        if (a < 0) {
            println("insira um numero valido")
        }
            else if (10 < a){
                println("insira um numero valido")
            }



    }
}