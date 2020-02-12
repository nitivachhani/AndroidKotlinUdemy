
fun addNumbers(x:Double = 0.0, y:Double = 0.0):Double{
    val temp = x+y
    //println("Add = $temp")
    return temp      // or return x+y
}

//vararg - variable number of arguments: argument will be Array

fun displayInfo(vararg names:String){
    for (name in names){
        println(name)
    }
}
//orss
fun displayInfo2(names:Array<String>){
    for (name in names){
        println(name)
    }
}



fun main(){
    println("Start Main Function")

    var returnAdd = addNumbers(3.0, 4.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumbers(x=5.0, y=12.0)
    println("returnAdd: $returnAdd")

    // second variable will have default value
    returnAdd = addNumbers(10.0)
    println("returnAdd: $returnAdd")

    // first variable will have default value
    returnAdd = addNumbers(y=10.0)
    println("returnAdd: $returnAdd")

    displayInfo(names = *arrayOf("Jenna", "Niti", "Kevin"))

    displayInfo2(names = arrayOf("Jenna", "Niti", "Kevin"))

    println("End Main Function")
}