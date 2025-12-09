package Basics_2

fun main() {

    val n1 = 30
    val n2 = 20

    // If the condition is false, it exits from if block
    if(n1>=n2 || n1<=30){
        println(":)")
    }
   // println("Some code") -> If we uncomment this line else block won't work as if & else comes hand in hand
    else{
        println("(:")
    }

    // if,else,else if
    if(n1==n2) println("In if block")
    else if(n1>n2) println("In else if block")
    else println("In else block")

   /*
   In Java we call if as Statement
   But, These are not statements; they are expressions.
   Let me show you how
   */
    val value = if(n1>=n2) {":)"} // Here it returns :)
    else{":("}

}