package org.rburgos

class CompanionObject {

    fun showCounter(){

        println("Counter =" + counter)

    }

    companion object {
        var counter = 1

        fun counterUp() {
            counter += 1
        }
    }
}

fun main(args: Array<String>){
    println(CompanionObject.counter)
    CompanionObject.counterUp()
    println(CompanionObject.counter)

    val instanceA = CompanionObject()
    instanceA.showCounter()

    val instanceB = CompanionObject()
    instanceB.showCounter()
}