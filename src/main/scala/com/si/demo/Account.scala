package com.si.demo

/**
  * Created by jack on 16-1-12.
  */
class Account private (val id: Int, initialBalence: Double) {
  private var balance = initialBalence
  def deposit(amount: Double) {balance += amount}
  def currentBalance() = balance
}

object Account {
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber}

  def apply(initialBalance: Double) = {
    new Account(newUniqueNumber(), initialBalance)
  }

  def main(args: Array[String]): Unit = {
    val acct = Account(1000.0)
    println("current balance : " + acct.currentBalance())
    acct.deposit(100.0)
    println("current balance : " + acct.currentBalance())
  }
}
