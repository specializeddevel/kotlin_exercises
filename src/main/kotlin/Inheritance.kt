package org.rburgos

open class BankAccount {
    var accountNumber = 0
    var accountBalance = 0.0

    constructor(accountNumber:Int,accountBalance:Double){
        this.accountNumber = accountNumber
        this.accountBalance = accountBalance
    }

    open fun displayBalance() {
        println("Number $accountNumber")
        println("Current balance is: $accountBalance")
    }

}

class SavingsAccount : BankAccount {

    var interestRate: Double = 0.0

    constructor(accountNumber:Int,accountBalance:Double,rate:Double):super(accountNumber,accountBalance) {
        interestRate = rate
    }

    fun calculateInterest(): Double {
        return interestRate * accountBalance
    }

    override fun displayBalance() {
        super.displayBalance()
        println("Prevailing Interest rate is: $interestRate")
        println("Calculated Interest is: ${calculateInterest()}")
        println("Total Balance now is: ${accountBalance + calculateInterest()}")
    }

}

fun main(args: Array<String>) {
    var micuenta = SavingsAccount(12311,600.00, 0.07)
    println()
    micuenta.displayBalance()
}