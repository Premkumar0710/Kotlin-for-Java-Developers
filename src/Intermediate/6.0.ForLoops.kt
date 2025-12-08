package Intermediate

fun main() {

    val names = listOf("mary","ali","alex")
    val numbers = intArrayOf(1,2,3,4)

    for(name in names){
        print(name + " ")
    }

    println()

    for(name in names){
        println(name.replaceFirstChar { c -> c.toUpperCase() })
    }



//    for(nums in numbers){
//        print(nums + " ")
//    }

}