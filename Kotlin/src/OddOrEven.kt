fun main(){
    print("Enter any number: ")
    val number = readLine()!!.toInt()
    val isOdd = if(number%2 == 0) false else true
    println("Number entered is odd? - $isOdd")
}