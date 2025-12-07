package Intermediate

fun main() {
    val n1 = 30
    val n2 = 20

    /*
    * In Java
    * String result = n1 > n2 ? ":)" : "(:"
    */

    // In Kotlin
    val result = if(n1>n2) ":)" else "(:"
    println(result)


}