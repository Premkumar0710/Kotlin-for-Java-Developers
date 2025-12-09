package Basics_3

fun main() {
    // In Java we will do new SmartDevice() for creating objects
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 100000.0
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    val phone = SmartDevice()
    phone.brand = "Apple"
    phone.price = 75000.0
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()
}


class SmartDevice {

    // Attributes
    var brand : String = "" // we used var here because val is literally final (Immutable)

    /*// getters & Setters are there by default; we need not even mention it
        *//*get() = field
        set(value) = {
            field = value.toUpperCase()
      }*/

    var price : Double = 0.0
    var isSwitchedOn : Boolean = false

    // Methods or Behaviours
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is Switching On")
    }
    fun turnOff(){
        isSwitchedOn = false
        println("$brand is Switching Off")
    }

    fun getDeviceState(){
        println("$brand is on: $isSwitchedOn")
    }

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price, isSwitchedOn=$isSwitchedOn)"
    }


}