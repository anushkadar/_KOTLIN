package org.anu.me

fun main(args: Array<String>) {

//Immutable and Mutalble variables
    val valName = "Chaitanya"
    //val is immutable, so cannot reassign
    //myName="Chaitanya Singh" -> will give C error
    println("My Name is: " + valName)

    //var is mutable so can reassign
    var varName = "Dagaya"
    varName = "dagaya sumanapala"
    println(varName);

//DataTypes
    //Byte
    val numByte: Byte = 99  //Range is -128 to 127
    //val num: Byte = 300 -> will give c error
    println("$numByte")

    //String
    var bigByte: Byte = Byte.MAX_VALUE
    var smallByte: Byte = Byte.MIN_VALUE
    println("Biggest Byte value is: " + bigByte)

    //String interpolation
    println("Smallest Byte value is: $smallByte")

    //Short
    val numShort: Short = 29999
    println("$numShort")

    //Int
    val numInt: Int = 123456
    println("$numInt")

    val numLong: Long = 12345678
    println("$numLong")

    //Double
    // all floating numbers are double by default unless suffix F
    val numDouble = 101.99
    println("$numDouble")

    //Float
    val numFloat = 101.99F
    println("$numFloat")

    //Boolean
    val boolValue = false
    println("$boolValue")

    //Char
    val ch = 'A'
    println("$ch")

    val ch2: Char
    ch2 = 'Z'
    println("$ch2")

// Type conversion inn Kotlin are explicit (not automatic) */
    val numInt1: Int = 101
    // val num2: Long = num1  -> will be a type mismatch error
    val num2: Long = numInt1.toLong()

    // Double to int type casting
    println("4.554 to int: " + (4.554.toInt()))
    //int to Char type casting
    println("66 to Char: " + (65.toChar()))
    //Char to int type casting
    println("B to int: " + ('B'.toInt()))
}
