package Intermediate

fun main() {
    val ans = doubleTheValue(2)
    println(ans)
    val simple = simplifiedFunction("Prem")
    println(simple)

}


fun doubleTheValue(n:Int) : Int{
    return n*2
}

/* Simplified way of writing function
Thumb rule is we can write this only if we have a single line action items
for multi line functions we need to have {}
*/
fun simplifiedFunction(name:String) : String = "$name just Simplified the way of writing function"