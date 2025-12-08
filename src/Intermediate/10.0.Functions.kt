package Intermediate

// Program flow starts here in main as like Java
fun main() {
    println("Hello") // here println is the fn call & "Hello" is the argument
    greet()
    greeting("Peter",18)

    /* named arguments
     We can change the arguments order but we should assign it properly
    */
    println("Named Arguments")
    greeting(age=19, name="Jamila")

    /*
    * Default Arguments
    * Parameter will be passed in the function directly
    */
    println("Default Arguments")
    cook("Bhat")

    // Usage of return statement
    cook("Stella",25)

    // Usage of \n
    cook("Tom",18)
}

/* Similar to void -> public void greet()
Mentioning unit is optional. We can omit it */
fun greet(): Unit{
    println("Greetings for the day !")
}

fun greeting(name:String, age:Int){
    println("Hello $name")
    if(age<18) println("$name is a Minor")
    else println("$name is a Major")
}

// Function for default Argument
fun cook(name:String,age:Int =20 ){
    println("Chef: $name is $age yrs old")
    if(age<0) return // Program ends here itself
    else print("$name is Eligible to become a chef\n")
    print("Check whether next line is working or not")
}