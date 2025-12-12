package Basics_2

fun findMax(nums : Array<Int>): Int {

    var max = Int.MIN_VALUE
    for(i in nums){
        if(i>max) max = i;
    }
    return max
}

fun findMin(nums : Array<Int>): Int {

    var min = Int.MAX_VALUE
    for(i in nums){
        if(i<min) min = i;
    }
    return min
}
fun main() {

    val biggestNum = findMax(arrayOf(1,2,3,4,5,7))
    val smallestNum = findMin(arrayOf(1,2,3,4,5,7))
    println("Biggest number : $biggestNum")
    println("Smallest number : $smallestNum")

}