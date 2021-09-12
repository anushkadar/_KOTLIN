package org.anu.me

fun main(args: Array<String>) {

    val num1 = 101.99
    val num2 = 100.50
    var op: Double

    op = num1 + num2
    println("Addition: $op")

    op = num1 - num2
    println("Subtraction: $op")

    op = num1 * num2
    println("Multiplication: $op")

    op = num1 / num2
    println("Division: $op")

    op = num1 % num2
    println("Modulus: $op")
}
