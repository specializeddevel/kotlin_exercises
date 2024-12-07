package org.rburgos

import org.rburgos.Clases.BankAccount

class Clases {

    val nombreClaseSuperior = "ClaseSuperior"

    inner class BankAccount(val accountNumber: Int, var accountBalance: Double) {

        var lastName: String
            get() {
                return "Name of the super class is: $nombreClaseSuperior"
            }
            set(value) {
                //lastName = value
                println("Name is: $value")
            }

        constructor(accountNumber: Int, accountBalance: Double, lastName: String)
                : this(accountNumber, accountBalance) {
            this.lastName = lastName
        }

    }
}

fun main() {
    val clases = Clases()
    val miUser: BankAccount = clases.BankAccount(10,23.45)
    miUser.lastName = "Daniel"
    println(miUser.lastName)
}