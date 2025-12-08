package Intermediate

fun main() {
     val names = listOf("Jamila","James","Saleh","Jemimah","Smriti")

    /*
    val j = names[0]
    val j1 = names[1]
    val s = names[2]
    */

    // single declaration (If we want to skip anything we can use underscore so that order is not impacted)
    val(one,two,_,four,five) = names
    println("$one $two $four $five")


}