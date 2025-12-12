package OOPS_1

// Getters & Setters are auto-generated (Implicit) by default & not explicit like Java
fun main(args: Array<String>) {

    // default parameters (changing the order of params but we are assigning the respective values)
    val user = User_GS(age=26,firstName="Halen",lastName = "donci")

    println(user.firstName) // directly calls getter unlike Java
    println(user.lastName)
    println(user.age)

}

class User_GS(firstName:String, var lastName:String, var age:Int){

    var firstName = firstName
        // Since its already implicit, it will throw redundant warning. So its better we modify something
        get() {return "FirstName : $field"} // if we don't use field here it calls getter again & again (Infinite loop)
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }

        /*get() = field
        set(value){
            value = $field
        }*/

    /* Illustration of getters & setters (How it works)

    fun setFirstName(newValue : String){
        this.firstName = newValue
    }

    fun getFirstName() : String{
        return this.firstName
    }

    */
}