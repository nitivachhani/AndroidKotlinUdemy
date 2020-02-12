import java.util.*

fun main(){
    print("Enter Year of birth: ")
    val yearOfBirth:Int = readLine()!!.toInt()
    val yearOfDevice = Calendar.getInstance().get(Calendar.YEAR)

    //val age: Int = 2020 - yearOfBirth
    val age: Int = yearOfDevice - yearOfBirth
    print("You are $age years old !!")
}