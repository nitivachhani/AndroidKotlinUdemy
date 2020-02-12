/*
Assignment4:
Find even numbers between 1-100 output 2 4 6 8 10 ....
*/

fun main(){

    for(numbers in 2..100 step 2){
        print("$numbers ")
    }

    println()

    for(number in 1..100){
        if(number % 2 == 0){
            print("$number ")
        }
    }

}