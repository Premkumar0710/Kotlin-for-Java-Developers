package Basics_2

fun main() {
    val ans = doubleTheValue(2)
    println(ans)
    val simple = simplifiedFunction("Prem")
    println(simple)
    val returnTwoValues = twoValues()
    println(returnTwoValues)
    val returnThreeValues = threeValues()
    println(returnThreeValues)

    // destructure multiple return values
    val (v1,v2) = twoValues()
    print("$v1 $v2")
}


fun doubleTheValue(n:Int) : Int{
    return n*2
}

/* Simplified way of writing function
Thumb rule is we can write this only if we have a single line action items
for multi line functions we need to have {}
*/
fun simplifiedFunction(name:String) : String = "$name just Simplified the way of writing function"

// Return Two values from functions
fun twoValues():Pair<String,Int>{
    return "Amigos" to 20
    // we can also use return Pair("Amigos",20)
}

// Return Three values from functions
fun threeValues():Triple<String,Int,Char>{
    return Triple("Amigos",26,'P')
}
