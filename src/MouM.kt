fun main() {

    var num = 0
    var men = 999

    for(i in 1 until 16) {
        var a: Int = readLine()!!.toInt()

        if (a > num){
            num = a
        }
        if (a < men){
            men = a
        }
        println("maior: " + num)
        println("menor: " + men)
    }
}