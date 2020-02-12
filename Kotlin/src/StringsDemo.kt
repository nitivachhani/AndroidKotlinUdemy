fun main(){
    val message = " Welcome to California! "
    val name = "Niti"

    //Concatenate strings
    //val allMessage = name + ", " + $message
    val allMessage = "$name, $message"
    println(allMessage)
    println(allMessage[0])
    println(allMessage.toLowerCase())
    println(allMessage.toUpperCase())
    println(message)
    println(message.trim())

    val listOfTokens = message.trim().split(" ")
    for(token in listOfTokens){
        if(!token.contains("to") && !token.contains("is")){
            println("Token: $token")
        }
    }
}