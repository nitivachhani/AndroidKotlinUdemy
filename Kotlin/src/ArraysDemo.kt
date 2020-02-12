fun main(){
    println("Pets App")

    // Write in Array

    print("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()


    //var listOfPets:Array<String> = Array(size = 3){""}
    // Integer: var listOfPets:Array<Int> = Array(maxSize){0} -> Initialize with 0
    var listOfPets = Array(maxSize){""}
    for(i in 0..(maxSize-1)){
        print("Enter pet$i: ")
        listOfPets[i] = readLine()!!.toString()
    }

    println("Your pets are using Array")
    for(i in 0 until maxSize){
        println("Pet $i: ${listOfPets[i]}")
    }
}