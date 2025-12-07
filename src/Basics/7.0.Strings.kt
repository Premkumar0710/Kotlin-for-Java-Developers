package Basics

fun main() {

    // Normal String
    val name = "Prem"
    println(name)

    // String Manipulations
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name.isEmpty())
    println("".isBlank())

    /*
    Note: Please Refer Documentations for other such manipulations
    */

    // String Concatenation

    val age = 20
    var lname = "Kumar"

    // Old way
    println(lname + " " + age)

    // Modern way (String Template)
    println("Name : $lname, Age : $age")
    // we can also write like this -> println("Name : ${lname}, Age : ${age}")


    // Multi-Line String
    val mls = """
        Hello %s
         How
        are 
        you
    """.trimIndent()
    println(mls.format("Ana")) // in the %s Ana will be injected


}