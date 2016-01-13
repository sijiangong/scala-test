package com.si.demo

class Counter {
  private var value = 0

  def increment() { value += 1 }

  def current() = value
}

object Counter {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter()
    myCounter.increment()
    print("current values is " + myCounter.current)
  }
}