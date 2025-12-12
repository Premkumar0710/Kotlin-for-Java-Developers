package OOPS

fun main(args: Array<String>) {
    val user = User("Alex","Dobinca",23)
    val friend = User("Tommy","Vercetti",32)
}

class User(name:String,var lastName:String,var age:Int){
    // here we won't be assigning the values since its been already done by var in the parameters

    var name : String

    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
        } else{
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}