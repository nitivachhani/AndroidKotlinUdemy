fun main() {

    println("For Loop")
    for(i in 1..10 step 1){
        println("Counter: $i")
    }

    println("WHille Loop")
    var i = 1
    while(i<=10){
        println("COunter: $i")
        i += 2
    }

    println("Do While Loop")
    i = 1
    do{
        println("Counter: $i")
        i += 2
    }while(i<=10)
}