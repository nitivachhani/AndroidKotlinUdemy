fun main(){
    var listOfUsers = hashMapOf<Int,String>()
    listOfUsers[123] = "Niti"
    listOfUsers[137] = "Kevin"

    println("Print ID 123 = ${listOfUsers[123]}")

    listOfUsers[123] = "Rana"
    println("Print ID 123 = ${listOfUsers[123]}")

    println("Print all elements in HashMap")
    for(key in listOfUsers.keys){
        println("Print ID $key = ${listOfUsers[key]}")
    }

}