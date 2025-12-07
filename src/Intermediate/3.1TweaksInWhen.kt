package Intermediate

fun main() {

    var n1 = 10
    var n2 = 20
    when{
        (n1>n2 || n1<=30) -> println(":)")
        (n1==100) -> println("foo")
    }

    // Ranges using when
    val age = 11
    when(age){
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("Child")
        else -> println("Default")
    }

    // As discussed earlier we have true,false,null as booleans
    val isAdult: Boolean? = null
    if(isAdult == true) println("not null & true")
    else println("false or null")
}