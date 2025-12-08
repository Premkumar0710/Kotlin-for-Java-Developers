package Intermediate

fun main() {

    var number = 1;
    println("Basic While loop")
    while(number<=5){
        println("Number : $number")
        number++
    }

    println("Reverse while")
    var brand = "AmigosCode"
    var index = brand.length-1
    while(index>=0){
        println("Character : ${brand[index]}")
        --index
    }
}