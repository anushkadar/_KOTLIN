package org.anu.me

import java.util.*

fun main(args: Array<String>) {
    print("Write anything here: ")

    val enteredString = readLine()
    println("You have entered this: $enteredString")

    //creating Scanner object
    val read = Scanner(System.`in`)

    //Taking integer input
    println("Enter an integer number: ")
    var num1 = read.nextInt()

    //Taking float input
    println("Enter a float number: ")
    var num2 = read.nextFloat()

    //Displaying input numbers
    println("First Input Number: "+num1)
    println("Second Input Number: "+num2)
}
