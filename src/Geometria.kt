open class Quadrado(h : Double, b : Double) {
var h = h
var b = b
var a = b * h
fun quadrado(){
    println("Forma: quadrado")
    println("Altura: $h")
    println("Base: $b")
    println("Area: $a")
}
}
class Retangulo(h : Double, b : Double) : Quadrado(h, b) {


    fun retangulo(){
        println("Forma: Retangulo")
        println("Altura: $h")
        println("Base: $b")
        println("Area: $a")
    }
}

class Triangulo(h : Double, b : Double) : Quadrado(h, b) {

    fun triangulo(){
        println("Forma: Triangulo")
        println("Altura: $h")
        println("Base: $b")
        println("Area: " + a/2)
    }
}

class Circulo(PI : Double, r : Double){
    var PI = 3.14
    var r = r
    var a = (r*r)*PI
    fun circulo(){
        println("Forma: Circulo")
        println("raio: $r")
        println("PI: $PI")
        println("Area: " + a/2)
    }
}