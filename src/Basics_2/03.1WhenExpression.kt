package Basics_2

fun main() {

    /*
    * When can be used both as a Statement as well as an expression (meaning it can return a value)
    * It's similar to Switch statement in Java. In java we use default, but here we use else if value doesn't match
    * */

    // Example for when statement
    val gender = "F"
    when(gender){
        "F" -> println("FEMALE")
        "M" -> println("MALE")
        else -> println("Unknown Gender")
    }

    // Example for when expression
    val input = "asdf"
    val res = when(input){
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> "Unknown Gender"
    }
    println(res)
}