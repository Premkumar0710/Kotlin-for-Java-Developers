package OOPS

fun main(args: Array<String>) {

    // default parameters (changing the order of params but we are assigning the respective values)
    val user = Userss(age=26,name="Halen",lastName = "donci")

    println("Name: ${user.name}")
    println("lastName: ${user.lastName}")
    println("age: ${user.age}")

}

class Userss(var name:String, var lastName:String, var age:Int){

}