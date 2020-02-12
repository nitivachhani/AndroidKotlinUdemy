fun main(){
    println("Pets App")

    var listOfPets = arrayListOf<String>()

    do{
        print("Enter Pet name or quit to exit: ")
        val petName = (readLine()!!.toString())
        if(petName != "quit"){
            listOfPets.add(petName)
        }
    }while(petName != "quit")

    println("Your pets are using Index")
    for(i in 0 until listOfPets.size){
        println("Pet $i: ${listOfPets[i]}")
    }

    println("Your pets are using Object")
    for(i in listOfPets){
        println("Pet $i")
    }

    if(listOfPets.contains("cat")){
        println("Your cat qualified for special care")
    }

}