fun main(){

    print("Enter your percentage: ")
    val grade = readLine()!!.toInt()

    if(grade>90){
        if(grade>95){
            println("Grade: A+")
        }else{
            println("Grade: A-")
        }
    }else if(grade in 80..89) {
        if(grade>85){
            println("Grade: B+")
        }else{
            println("Grade: B-")
        }
    }else if(grade in 70..79){
        if(grade>75){
            println("Grade: C+")
        }else{
            println("Grade: C-")
        }
    }else {
        println("Grade: Fail")
    }

    println("End of program")

}