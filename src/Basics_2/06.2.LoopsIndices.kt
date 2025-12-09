package Basics_2

fun main() {
    val letters = charArrayOf('A','B','C','D','E')
    // get index
    for(indices in letters.indices){
        println(indices)
    }

    println("Normal sequence")
    for(index in letters.indices){
        println("$index - ${letters[index]}")
    }

    // reverse sequence
    println("Reverse sequence")
    for(index in letters.indices.reversed()){
        println("$index - ${letters[index]}")
    }
}