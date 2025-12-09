package Basics_2

fun main() {

    println("Looping Strings")
    val brand = "Amigoscode"
    for (l in brand){
        println(l)
    }

    println("For each")
    val names = listOf("mary","ali","alex")
    names.forEach { println(it) }
}