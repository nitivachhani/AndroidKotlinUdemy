/*
This APp get user infor then print them
We did it as part from learning session
*/

fun main() {

    // Ask for user name
    print("Enter Name: ")
    val name:String = readLine()!!.toString()

    // Ask for User AGe
    print("Enter Age: ")
    val age:Int = readLine()!!.toInt()

    // Ask for User GPA
    print("Enter GPA: ")
    val gpa:Double = readLine()!!.toDouble()

    println("-----User Info------")
    println("Name: " + name)
    println("Age: $age")
    println("GPA: $gpa")

}