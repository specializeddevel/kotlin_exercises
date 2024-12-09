package org.rburgos

fun main() {
    println("The sum is ${sumar(a=35)}")
    println("El mayor numero es ${encuentraMayor(35,12)}")
    muestraValores(12,35)
    println()
    val referenciaSumar = ::sumar
    println(sumar(1,1))
    println(sumaLambda)
    //Llamada a una funcion con un parametro que es una funcion
    outputConvesion(::inchesToFeet,22.45, "feet")
    outputConvesion(::inchesToYards, 22.45, "yards")
    //recibe en converter la fncion correspondiente de conversion segn el booleano
    //true convertira a pies
    //false convertira a yardas
    val converter = decideFunction(true)
    //hace la conversion con la funcion recibida
    val result = converter(22.4)
    println(result)
}

fun sumar(a: Int=0, b:Int=10):Int = a+b

fun encuentraMayor(a: Int, b:Int):Int?{
    return if (a > b) a else b
}

fun muestraValores(a:Int, b:Int){
    println()
    if (encuentraMayor(a,b)==a) for (i in b..a) print("$i, ") else for (i in a..b) print("$i, ")
}

val sumaLambda = { a: Int, b: Int -> a+b }(5,5)

fun inchesToFeet(inches:Double):Double = inches*0.0833333
fun inchesToYards(inches:Double):Double = inches*0.0277778

//Funcion que recibe una funcion como argumento y la ejecuta
fun outputConvesion(converterFunc: (Double) -> Double, value:Double, typeConversion:String) {
    val result = converterFunc(value)
    println("Result of conversion from inches to $typeConversion is $result")
}

//Funcion que recibe un booleano y retorna una funcion con la forma (double) -> Double
fun decideFunction(feet: Boolean): (Double) -> Double
{
    if (feet) {
        return ::inchesToFeet
    } else {
        return ::inchesToYards
    }
}