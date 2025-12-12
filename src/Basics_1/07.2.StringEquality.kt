package `01_Basics`

fun main() {

    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = String("Saleh".toCharArray())

/*   In Java, we will use .equals() alone to compare String equality. But in Kotlin we can use both the below mentioned methods
     Basically both are used for comparing contents
*/
    println("== -> ${name1 == name3}")
    println(".equals -> ${name1.equals(name3)}")

    // To compare memory location
    val name4 = "Jemimah"
    val name5 = "Jemimah"
    println("Memory comparison -> ${name4 === name5}")


}