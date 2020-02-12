fun main(){
    println("Continue example")
    for(number in 1..10){
        if(number==5){
            continue
        }
        println(number)
    }

    println("Break example")
    for(number in 1..10){
        if(number==6){
            break
        }
        println(number)
    }

    println("Break Inner example")
    for(number in 1..10){
        println("Outer Loop: Number = $number")
        for (i in 1..7){
            println("Inner Loop: $i")
            if(i==6){
                break
            }
        }
        println(number)
    }

    println("Break Outer example")
    loop@ for(number in 1..10){
        println("Outer Loop: Number = $number")
        for (i in 1..7){
            println("Inner Loop: $i")
            if(i==6){
                break@loop
            }
        }
        println(number)
    }

    println("End App")
}