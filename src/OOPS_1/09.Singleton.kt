package OOPS_1

fun main(args: Array<String>) {
    /*val instance1 = Database.getInstance();
    val instance2 = Database.getInstance();
    println(instance1 == instance2) // checks reference*/

    println(Database)
    println(Database)
}

// Simplified version of implementing singleton
object Database{
    init {
        println("Database created")
    }
}
/*
class Database private constructor(){

    companion object{
        private var instance : Database? = null

        fun getInstance() : Database? {
            if(instance == null){
                instance = Database()
            }

            return instance;
        }
    }
}*/
