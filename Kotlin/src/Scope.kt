

//fun showInfo(name:String){ } -
// Cannot define same functions name with same variable under same class

// name: Global Variable
var name = ""

fun showUserInfo(name:String){
    // name: Local variable for function showUserInfo()
    println("name: $name")
}

fun showUserInfo(){
    // name: Local variable for this function
    // Cannot access local variable name from main()
    // Can access global variable name
    name = "Welcome $name"
    println("name: $name")
}

fun main(){

    // name: Local Variable
    //var name = "Rama"
    name = "Rama"
    showUserInfo(name)

    showUserInfo()

    showInfo("Niti")
    showUserInfo("Kevin")

    for(i in 1..10){
        val age = 22
    }
    // age is local. Make it global/public
    //print(age)

}