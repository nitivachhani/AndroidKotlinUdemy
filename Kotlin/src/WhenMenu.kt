fun main(){

    print("Enter Food ID: ")
    val foodID: Int = readLine()!!.toInt()
    when(foodID){
        1 -> {
            println("You got Sandwich")
        }
        2 -> {
            println("You got Burger")
        }
        3 -> {
            println("You got French Fries")
        }
        else -> {
            println("You did not order anything")
        }
    }
}