fun main(){

    println("digite uma forma quadrado, retangulo, triangulo, circulo")
    val forma : String = readLine()!!

    val q = Quadrado(4.0,4.0)
    val r = Retangulo(5.0,2.0)
    val t = Triangulo(5.0,2.0)
    val c = Circulo(3.14,6.0)

    if (forma == "quadrado") {
        q.quadrado()
    }
    if (forma == "retangulo") {
        r.retangulo()
    }
    if(forma == "triangulo"){
        t.triangulo()
    }
    if(forma == "circulo"){
        c.circulo()
    }

}