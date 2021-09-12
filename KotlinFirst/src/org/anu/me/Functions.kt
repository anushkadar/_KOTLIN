package org.anu.me

//1. Standard Library Function
//2. User-defined functions

//Standard Library Function
fun main(args : Array<String>){

    var num = 16
    println("Square root of $num is: ${Math.sqrt(num.toDouble())}")
    sayHello()
    println("Sum: ${sum(10, 20, 30, 40)}")

    println("6 + 4 = ${inLinesum(6,4)}")

}

//Created the function
fun sayHello(){
    println("Hello")
}

//Created the function
fun sum(vararg numbers: Int): Int
{
    var sum = 0
    numbers.forEach {num -> sum +=  num}

    return sum
}

// inline Function
val inLinesum = {num1: Int, num2: Int -> num1 + num2}

//Created the function
fun returnArray1(vararg numbers: Int): Array<Int>
{
    val array : Array<Int> = emptyArray()
    val emptyArray : Array<Int> = arrayOf()
    var i = 0;
    numbers.forEach {num ->  array[i++] = num }

    return  array;
}
