import java.util.*

class Person(var name:String, var age:Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {
        // Ascending
        return this.age - other.age
        // DEscending: return other.age - this.age
    }
}

fun main(args:Array<String>){
    var listOfNames = arrayListOf<String>()
    listOfNames.add("Niti")
    listOfNames.add("Kevin")
    listOfNames.add("Hiral")

    println("---Before Sort---")
    for (name in listOfNames){
        println(name)
    }

    println("---After Sort---")
    Collections.sort(listOfNames)
    for (name in listOfNames){
        println(name)
    }


    var listOfPersons = arrayListOf<Person>()
    listOfPersons.add(Person("Niti", 33))
    listOfPersons.add(Person("Kevin", 35))
    listOfPersons.add(Person("Hiral", 32))

    println("---Before Sort---")
    for (person in listOfPersons){
        println(person.name)
        println(person.age)
    }

    println("---After Sort---")
    // Collections cannot sort
    Collections.sort(listOfPersons)
    for (person in listOfPersons){
        println(person.name)
        println(person.age)
    }
}