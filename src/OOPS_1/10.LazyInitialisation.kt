package OOPS_1

fun main(args: Array<String>) {

    val user1 = User_LII("Alex","Monti",24)
    // val user2 = User_LII("User","lastName",24)

    // Unless we invoke it, it won't create object (means it won't execute println() inside init)
    val user2 by lazy {
        User_LII("User","lastName",24)
    }

    // Here we invoked the object, so object got created & result is being printed
    println(user2.firstName)

}


class User_LII(var firstName : String, var lastName : String, var age : Int){

    init {
        println("User: $firstName was created")
    }
}