package org.rburgos

fun main() {
    println("The sum is ${sumar(a=35)}")
    println("El mayor numero es ${encuentraMayot(35,12)}")
    muestraValores(12,35)
    println()
    val referenciaSumar = ::sumar
    println(sumar(1,1))
    println(sumaLambda)
    outputConvesion(::inchesToFeet,22.45, "feet")
    outputConvesion(::inchesToYards, 22.45, "yards")
}

fun sumar(a: Int=0, b:Int=0):Int = a+b

fun encuentraMayot(a: Int, b:Int):Int?{
    return if (a > b) a else b
}

fun muestraValores(a:Int, b:Int){
    println()
    if (encuentraMayot(a,b)==a) for (i in b..a) print("$i, ") else for (i in a..b) print("$i, ")
}

val sumaLambda = { a: Int, b: Int -> a+b }(5,5)

fun inchesToFeet(inches:Double):Double = inches*0.0833333
fun inchesToYards(inches:Double):Double = inches*0.0277778

fun outputConvesion(converterFunc: (Double) -> Double, value:Double, typeConversion:String) {
    val result = converterFunc(value)
    println("Result of conversion from inches to $typeConversion is $result")
}