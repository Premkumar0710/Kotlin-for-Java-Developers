package OOPS_1

fun main(args: Array<String>) {
    // Instead of assigning every attributes as like prev lecture, we can use constructors
    val car1 = Cars("Suzuki  ","Swift-Dzire","Grey",4)

    println("Name : ${car1.name}")
    println("Model : ${car1.model}")
    println("Color : ${car1.color}")
    println("Doors : ${car1.doors}")

    car1.move()
    car1.stop()
}

private class Cars(name: String, var model: String, var color: String, var doors: Int){

  /* In java, we will use this as Cars(){this.name = name ......}
     we can simplify the below 4 lines of code by adding var to each params
     if you hover over the attrs, it will show option as move to constructors */

    /*
    var name = name
    var model = model
    var color = color
    var doors = doors
    */

    // If its highlighted in pink then its attribute else it's a parameter (In Intellij idea)
    var name = name.trim()

    fun move(){ println("$name is moving") }
    fun stop(){ println("$name has stopped") }

}