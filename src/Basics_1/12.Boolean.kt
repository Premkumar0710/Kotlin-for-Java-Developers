package `01_Basics`

fun main() {

    // Possible results in a Boolean -> true,false,null
    val isAdult = false
    val isMale = true
    val isFemale = true
    println(isAdult)
    println(isMale)

    val isOrderCompleted: Boolean? = null
    println(isOrderCompleted)

    /* Naming conventions for boolean
    * It's always very important to use some prefix before naming the variable while using boolean
    * Examples : hasSlept, isMale, isOrderCompleted
    */

    // Logical Operators on boolean

    /*
    AND CONDITION
    When all are True -> true
    When any one is false -> false
    When all are false -> false
  */
    println(isMale && isFemale)
    println(isMale && isAdult)
    println(isAdult && isAdult)

    /*
    OR CONDITION
    When all are True -> true
    When any one is true -> true
    When all are false -> false
  */
    println(isMale || isFemale)
    println(isMale || isAdult)
    println(isAdult || isAdult)

    // Negation (Flips the value)
    println(!isAdult)

    // Combination of all (false && false -> false)
    println(!isMale && (isFemale && isAdult))

}