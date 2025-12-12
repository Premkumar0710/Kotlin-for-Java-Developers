package OOPS_1

fun main(args: Array<String>) {

    val alexAccount = Account("Alex")
    alexAccount.deposit(1000)
    alexAccount.withdraw(500)
    alexAccount.deposit(-20)
    alexAccount.withdraw(-100)
    print("Balance : ${alexAccount.calculateBalance()}")

}

class Account(val accountName : String){

    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount:Int){
        if(amount>0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now $balance")
        } else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawl:Int){
        if(-withdrawl<0){
            transactions.add(withdrawl)
            this.balance += -withdrawl
            println("$withdrawl deposited. Balance is now $balance")
        } else{
            println("Cannot withdraw negative sums")
        }
    }

    fun calculateBalance() : Int{
        this.balance = 0
        for(t in transactions){
            this.balance += t
        }

        return this.balance
    }
}