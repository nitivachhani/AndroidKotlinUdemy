fun main() {

    val str1 = "Niti, Welcome to Kotlin"
    val str2:String
    str2 = "Niti, Welcome to Kotlin"

    println(str1)
    println(str2)

    val name = "Niti Patel"
    val age = 30
    val gpa = 3.95

    println("-----User Info------")
    println("Name: " + name)
    println("Age: $age")
    println("GPA: $gpa")

    var department:String   // department = null
    department = "Software"
    println("Department: $department")
    
    var department2:String?
    department2 = null
    println("Department: ${department2}")

    var department3:String?
    department3 = null
    println("Department: ${department3}")    // null allowed - no error
    println("Department: ${department3!!}")  // no null allowed - throw error
}