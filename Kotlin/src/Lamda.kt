
//fun sum(number1:Int, number2: Int):Int {
//    return number1 + number2
//}

//OR

val sum = {number1:Int, number2:Int ->
    number1 + number2
}

fun main(){
    val addNumbers = sum(3,4)
    println("addNumbers: $addNumbers")

    println("List of numbers")
    val listOfNumbers = listOf(10,15,22,34,80)
    //for(number in listOfNumbers){
    //    println("Number: $number")
    //}
    //OR
    listOfNumbers.forEach {number ->
        println("Number: $number")
    }
}

