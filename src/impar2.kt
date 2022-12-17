fun main() {
    var a : Int = readLine()!!.toInt()
    var b : Int = readLine()!!.toInt()
    var c : Int = 0
    if (a > b) {

        while (a > b){
            a--
            if (a%2 != 0) {
                c++
                println(c)
                }
            }
        }
        if (b > a) {

        while (b > a){
            b--
            if (b%2 != 0) {
                c++
                println(c)
            }
        }
    }
}

