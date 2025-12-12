package OOPS_1

fun main(args: Array<String>) {

    println(Direction.EAST)
    println(Direction.NORTH)
    println(Direction.WEST)
    println(Direction.SOUTH)

    println(Directions.EAST.distance)
    println(Directions.SOUTH.distance)
    println(Directions.WEST.direction)
    println(Directions.NORTH.direction)

    Directions.WEST.printData()

    // Looping through enums
    println("Looping starts ...")
    for(direction in Directions.entries){
        println(direction)
    }

    // Using when
    val direction = Directions.WEST
    when(direction){
        Directions.EAST -> println("The direction is East")
        Directions.NORTH -> println("The direction is North")
        Directions.SOUTH -> println("The direction is South")
        Directions.WEST -> println("The direction is West")
    }

    println("Using valueOf()")
    val directionVal = Directions.valueOf("EAST")
    println(directionVal)

}

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

enum class Directions(var direction: String, var distance: Int){
    NORTH("North",10),
    SOUTH("South",20),
    EAST("East",30),
    WEST("West",40); // Semi colon is must to end the enum

    fun printData(){
        println("Direction : $direction & Distance : $distance")
    }
}