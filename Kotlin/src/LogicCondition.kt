/*
> --> Greater than
< --> Less than
>= -> Greater than or equal to
<= -> Less than or equal to
== -> Equal to
!= -> Not Equal to
&& --> AND gate
    True && True = True
    True && False = False
    False && True = False
    False && False = False
|| --> OR gate
    True || True = True
    True || False = True
    False || True = True
    False || False = False
! --> NOT gate
    !True = False
    !False = True
&& --> AND gate
    True && True = True
    True && False = False
    False && True = False
    False && False = False  
 */


fun main() {

    var condition:Boolean = (3 > 2)
    println(condition)
    condition = (3 < 2)
    println(condition)
    condition = (2 >= 2)
    println(condition)
    condition = (2 <= 2)
    println(condition)
    condition = (2 == 2)
    println(condition)
    condition = (2 != 2)
    println(condition)

    var number = 11
    println(number>=10 && number <=10)

    var age = 22
    println(age>=60 || age<=18)
    println(!(age==22))
    println(age in 10..30)  // age > 10 && age < 30
}