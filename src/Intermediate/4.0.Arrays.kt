package Intermediate

fun main() {
   // val name : String = "Jamila james"

    // accepts all sort of data types
    val names = arrayOf("Jamila","James",2,3.0)

    // Specific data types -> Generics
    val names1 = arrayOf<String>("Prem")

    // Array indexing
    println(names[0])
    names[0] = "Sameera"
    println(names[0])
    println(names[3])

    // Find size of an array
    println(names.size)

    // overrides refrence names with contents present in an array
    println(names.contentToString())
    println(names1.contentToString())

    // Check whether the element is Present in an array or not
    if("James" in names) println("found")
    else println("Not found")
}