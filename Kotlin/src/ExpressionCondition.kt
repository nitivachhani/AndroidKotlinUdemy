fun main(){

    // GPA> 3.8 + isMarried

    val isMarried = true
    val GPA = 3.9

    val isQualified = if (isMarried && GPA >=3.8) 1 else 0

    println("IsQUalified = $isQualified")

    val isGood = when (GPA){
        3.8 -> true
        else -> false
    }
}