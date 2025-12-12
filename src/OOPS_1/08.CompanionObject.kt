package OOPS_1

fun main(args: Array<String>) {

    /*
    If the function is wrapped under companion block; then it belongs to the class not the object
    val calculator = Calculator()
    val ans : Int = calculator.sum(7,7)
    println(ans)
    */

    // companion object usage (Similar to static in Java)
    val result = Calculator.sum(7,19)
    println(result)
    println(Calculator.dummyUsage) // can access variables as well
}

class Calculator{

    companion object {
        var dummyUsage : Int = Int.MAX_VALUE
        fun sum(a : Int, b : Int) : Int{
            return a+b
        }
    }

}