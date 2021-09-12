package org.anu.me

fun main(args : Array<String>){

    var firstName = "Chaitanya"
    var str1 = "BeginnersBook"
    var str2 = "beginnersbook"

    /**
     * String interpolation
     */
    println("String Length: ${firstName.length}")

    /**
     * Or you can display like this
     */
    println("String Length: " + firstName.length)

    /**
     * true if equals, otherwise false
     */
    println("String Equals? : ${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */
    println("String Equals? : ${str1.compareTo(str2)}")

    var str = "BeginnersBook"

    println("3rd Index: ${str.get(3)}")

    /**
     * Another way of doing the same
     * This is the recommended way
     */
    println("3rd Index: ${str[3]}")

    /**
     * Here fromIndex is inclusive and
     * toIndex is exclusive which means
     * 5th index char will not be included
     */
    println("Index from 2 to 5: " +  str.subSequence(2,5))
}
