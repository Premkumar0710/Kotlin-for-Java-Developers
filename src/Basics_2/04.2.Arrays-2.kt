package Basics_2

fun main() {
     // ways of creating Arrays

    // Method 1
    var names = arrayOf("Hi","all")

    // Method 2
    val arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())

    arrayOfNulls[4] = "hello"
    println(arrayOfNulls.contentToString())

    // Method 3 (Likewise we have for all the datatypes)
    val intArray = intArrayOf(1,2,3,4)
    println(intArray.contentToString())

}