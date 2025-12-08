package Intermediate

import java.util.*

fun main() {

    // Immutable list
    val names : List<String> = listOf("JAMILA","SALEH","PETER") // Immutable (Both insert & update not possible)
    println(names)

    // Ways to access elements in a list
    println(names[0]) // This is Preferred in Kotlin
    println(names.get(1)) // We will use this in Java

    // other operations
    println(names.contains("Peter"))
    println(names.first())
    println(names.last())
    println(names.indexOf("SALEH"))

    // Mutable list
    val name = mutableListOf("Prem","Kumar","Ram")
    name.add("Rahul")
    name.removeLast()
    name.addFirst("Hi")
    name.removeFirst()
    name.add("John")
    name.remove("John")
    println(name)

    val emptyList = mutableListOf<Any>()
    println(emptyList)

}