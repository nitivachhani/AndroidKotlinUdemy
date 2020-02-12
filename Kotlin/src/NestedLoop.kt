fun main() {
    for(userID in 1..2 step 1){
        print("$userID - Enter your name: ")
        val name = readLine()!!.toString()
        print("Enter your city: ")
        val livePlace = readLine()!!.toString()
        var petName:String? = ""
        print("Enter number of pets: ")
        val petsCount = readLine()!!.toInt()

        for(petID in 1..petsCount step 1){
            print("Enter Pet $petID: ")
            petName += readLine()!!.toString() + ","
        }

        println("===== User $userID Info =====")
        println("name: $name")
        println("Live Place: $livePlace")
        println("petName: $petName")

        if(petName!!.contains("cat")){
            println("We have program for your cat")
        }
    }
}