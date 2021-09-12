package org.anu.me

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    //standard way to get empty Array
    val emptyArray1: Array<Int> = emptyArray()
    //shorted with Type
    val emptyArray2 = emptyArray<Int>()
    //usering arrayOf()
    val emptyArray3: Array<Int> = arrayOf()
    //usering arrayOf() with type
    val emptyArray4: Array<Int> = arrayOf<Int>()
    //array of null;
    val emptyArray5: Array<Int?> = arrayOfNulls(0)
    //arry of null speficing type
    val emptyArray6 = arrayOfNulls<Int?>(0)
    //using array Constructor
    val emptyArray7 = Array(0) { 0 }

    //Array with multiple different data types.
    var multiDataArray = arrayOf(10, "Book", 10.99, 'A')

    var intArray = arrayOf<Int>(1, 22, 55)

    var stringArray = arrayOf<String>("ab", "bc", "cd")


    /** Displaying 4th element */
    println(multiDataArray[3])

    /** modifying 4th element */
    multiDataArray[3] = 100

    /**  Displaying 4th element again */
    println(multiDataArray[3])
    println("Size of Array arr is: ${multiDataArray.size}")
    println("Array contains Book: ${multiDataArray.contains("Book")}")
    println("First Element: ${multiDataArray.first()}")
    println("Last Element: ${multiDataArray.last()}")
    println("Index of 22: ${multiDataArray.indexOf(22)}")

    var temp = null;
    var array = arrayOf(10, "Book", 10.99, 'A', temp);

    println(Arrays.toString(arrayTest(10, "Book", 10.99, 'A', temp)));
    println(Arrays.toString(arrayTest1(array)));
    println(Arrays.toString(arrayTest2(array)));
}

//Created the function
fun arrayTest(vararg items: Any?): Array<Any?> {
    val values: Array<Any?> = arrayOfNulls(items.size)
    var i = 0;
    items.forEach { num -> values[i++] = num }

    return values;
}

//Created the function
/*fun arrayTest0(items: Array<Any>): Array<Any> {
    val values: Array<Any> = arrayOfNulls(items.size)
    var i = 0;
    items.forEach { num -> values[i++] = num }

    return values;
}
*/


//Created the function
fun arrayTest1(items: Array<Any?>): Array<Any?> {
    val values: Array<Any?> = arrayOfNulls(items.size)
    var i = 0;
    items.forEach { num -> values[i++] = num }

    return values;
}

//Created the function
fun arrayTest2(items: Array<Any?>): Array<Any?> {
    val values: Array<Any?> = Array<Any?>(items.size){null}
    var i = 0;
    items.forEach { num -> values[i++] = num }

    return values;
}

