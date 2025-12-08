package Intermediate

fun main() {

    println("Range loops")
    for(i in 1..10) println(i)

    println("Range loops in Reverse order")
    for(i in 7 downTo 1 ) println(i)

    println("Skip sequence")
    for(i in 1..7 step 2) println(i)

    println("Reverse Skip")
    for(i in 5 downTo 1 step 2) println(i)
}