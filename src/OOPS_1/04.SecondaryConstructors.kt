package OOPS_1

fun main(args: Array<String>) {

    val friend = Users("Tommy","Vercetti",32) // uses Primary constructor
    val user = Users("Alex") // Uses secondary constructor
    val user1 = Users("Lance","Klusner") // Uses third constructor

    println("Name: ${friend.name}")
    println("lastName: ${friend.lastName}")
    println("age: ${friend.age}")

    println()

    println("Name: ${user.name}")
    println("lastName: ${user.lastName}")
    println("age: ${user.age}")

    println()

    println("Name: ${user1.name}")
    println("lastName: ${user1.lastName}")
    println("age: ${user1.age}")
}

class Users(var name:String, var lastName:String, var age:Int){

    // Secondary Constructor (It uses primary constructor again to initialize)
    // Here default value will be overriden by LastName
    constructor(name: String) : this(name,"LastName",0){
        println("2nd Constructor")
    }
    constructor(name : String, lastName : String):this(name,lastName,0){
        println("3rd Constructor")
    }
}