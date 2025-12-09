package Basics_3

fun main() {
    val p = Person()
    val person = Person("Prem", 26)
    println("${person.name} ${person.age}")
    println("$person - After overriding toString()")

    val person1 = Person("Prem",26)

    println("Compares equality : ${person == person1}") // Compares values (We must override equals & hashcode)
    println("Compares reference : ${person === person1}") // Compares Reference
}

// Constructor
class Person(val name: String, val age: Int){
    constructor() : this("",0) // multiple constructor



    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }


}



