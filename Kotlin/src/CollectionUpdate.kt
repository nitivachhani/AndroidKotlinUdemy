/*
mutable: you can update, add more
immutable: you cannot update, you cannot add more
 */

fun main(){

    //1 - list

    // immutable

    val listImmutable = listOf("Niti", "Kevin")
    //var list = listOf<String>("Niti", "Kevin")
    //list[0] = "World"
    for(name in listImmutable){
        println(name)
    }

    // mutable

    var listMutable = mutableListOf("Niti", "Kevin")
    //var list = listOf<String>("Niti", "Kevin")
    listMutable[0] = "World"           // allowed
    for(name in listMutable){
        println(name)
    }

    // 2 - Hash Map

    // Immutable

    val listOfusersImmutable = mapOf(1 to "Niti", 2 to "Kevin")
    //var listOfusers = mapOf<Int, String>(1 to "Niti", 2 to "Kevin")

    // Mutable

    val listOfusersMutable = mutableMapOf(1 to "Niti", 2 to "Kevin")


}