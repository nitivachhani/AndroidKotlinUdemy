fun main(){

    print("Enter your percentage: ")
    val grade = readLine()!!.toInt()

    if(grade>90){
        println("Grade: A")
    }
    if(grade<70){
        println("Grade: Fail")
    }
    if(grade in 80..89){
        println("Grade: B")
    }
    if(grade in 70..79){
        println("Grade: C")
    }

    println("End of program")

}