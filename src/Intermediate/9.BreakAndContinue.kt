package Intermediate

fun main() {

    val numbers = intArrayOf(1,2,3,4,5,6,7,8)
    for(n in numbers){
        if(n%2==0) continue // Skips even numbers
        if(n>5) break // loop breaks & comes out once 6 comes (>5)
        println(n)
    }

    /*
    * Break & Continue will work only inside loops
    * It also doesn't work under lambda expressions / Functional Programming
    * */
}