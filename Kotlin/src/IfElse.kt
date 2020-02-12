fun main(){

    print("Enter your age: ")
    val age = readLine()!!.toInt()

    if(age<18){
        println("You cannot apply for the job")
    }else{
        println("You can apply for the job")
    }

    println("END of APP")
}