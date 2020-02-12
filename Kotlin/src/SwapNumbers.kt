/*
Assignment1: swap two numbers
You have two number x=10, y=20
you need to swap these two number the output x=20, y=10
*/

/*
Assignment 2:
You have two number x=10, y=20
you need to swap these two number without using a temporary variable
 */

fun main() {
    var x = 10
    var y = 20
    val temp:Int      // Not changing; So make it val

    println("Before swapping")
    println("x: $x and y: $y ")

    temp = x
    x = y
    y = temp

    println("Before swapping")
    println("x: $x and y: $y")

    // Part 2: Enter numbers by user through console

    print("Enter First number: ")
    var x1 = readLine()!!.toInt()
    print("Enter First number: ")
    var y1 = readLine()!!.toInt()
    val temp1:Int      // Not changing; So make it val

    println("Before swapping")
    println("x1: $x1 and y1: $y1 ")

    temp1 = x1
    x1 = y1
    y1 = temp1

    println("After swapping")
    println("x1: $x1 and y1: $y1")

    // Part3: Assignment 2: Swap without using temp variable

    print("Enter First number: ")
    var x2 = readLine()!!.toInt()
    print("Enter First number: ")
    var y2 = readLine()!!.toInt()

    println("Before swapping")
    println("x2: $x2 and y2: $y2")

    y2 = y2 + x2
    x2 = y2 - x2
    y2 = y2 - x2

    println("After swapping")
    println("x2: $x2 and y2: $y2")

}