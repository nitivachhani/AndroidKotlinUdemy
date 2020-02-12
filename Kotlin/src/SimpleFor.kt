fun main(){

    println("======Increment loop======")
    for(i in 1..100 step 2){
        println("Hello World $i !!")
    }

    println("======Decrement loop======")
    for(i in 100 downTo 0 step 2){
        println("Hello World $i !!")
    }
    println("End App")
}