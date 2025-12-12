package OOPS

fun main(args: Array<String>) {

    val user = User_LI("Aniket","Varma",22)
    // println(user.favMovie) -> Throws UninitializedPropertyAccessException exception
    user.favMovie = "Interstellar"
}

class User_LI(var firstName : String, var lastName : String, var age : Int){

    // initialize this property later (If we don't use this it will result in CTE)
    // Note : It doesn't work with Primitives like Int Double (When compiled its turned to primitive even if we use wrapper)
    lateinit var favMovie : String
}