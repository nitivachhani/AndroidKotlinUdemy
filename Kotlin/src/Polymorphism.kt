/*
Polymorphism:
Same function name, same number of variables but different type
 */

fun showInfo(cardId:Int){
    // Check if card is valid
    println("cardID: $cardId")
}

fun showInfo(name:String){
    // CHeck if user is active
    println("Name: $name")
}

fun main(){
    showInfo("Niti")
    showInfo(6472642)
}