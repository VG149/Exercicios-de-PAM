fun main() {
    var a : Int = readLine()!!.toInt()
    var b : Int = readLine()!!.toInt()

    if (a > b) {
        println(a)
        while (a > b){
            a--
            if (a%2 != 0) {
                println(a)
            }
    }

    }
    if (b > a) {
        println(b)
        while (b > a){
            b--
            if (b%2 != 0) {
                println(b)
            }
        }

    }
}