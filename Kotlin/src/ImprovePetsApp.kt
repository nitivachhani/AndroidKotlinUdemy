import java.util.*
import java.util.LinkedList

fun main() {

    var listOfUsers = HashMap<String,LinkedList<String>>()

    while(true){
        print("Enter your name or quit: ")
        val name = readLine()!!.toString()
        if(name=="quit"){
            break
        }
        print("Enter your city: ")
        val livePlace = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()
        do{
            print("Enter Pet Name or type next:")
            val petName = readLine()!!.toString()
            if(petName!= "next"){
                listOfUserPets.add(petName)
            }
        }while(petName!="next")

        // key = name + : + livePlace
        listOfUsers["$name:$livePlace"]=listOfUserPets


    }
    println("===== User  Info =====")

    for(key in listOfUsers.keys){
        println("name and live place: $key")
        for(petName in listOfUsers[key]!!){
            println("petName: $petName")
        }
        if(listOfUsers[key]!!.contains("cat")){
            println("We have program for your cat")
        }
    }
}