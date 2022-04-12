package module4

fun main() {
    //println(max(5, 28))
    //println(printIfPositive(10))
    //println(printIfPositive(-10))

    println("Enter a")
    val a: Int = readLine()?.toIntOrNull() ?: return
    println("Enter b")
    val b: Int = readLine()?.toIntOrNull() ?: return
    println("Enter c")
    val c: Int = readLine()?.toIntOrNull() ?: return

    val x = solveEquation(a, b, c)
    if (x == null)
        println("No solutions")
    else
        println(x)
}

fun solveEquation(a: Int, b: Int, c: Int): Double? {
    if (a == 0) return null
    return (c - b) / a.toDouble()
}

fun max(a: Int, b: Int) : Int {
    val maxNumber: Int
    if (a > b) {
        maxNumber = a
    } else {
        maxNumber = b
    }
    return maxNumber
}

fun printIfPositive(n: Int) {
    if (n > 0)
        println(n)
    println(n + 1000)
}

fun getDeveloperPosition(experience: Int): String {
    when (experience) {
        0 -> return "intern"
        in 1..2 -> return "junior"
        in 3..4 -> return "middle"
        in 4..5 -> return "senior"
        else -> return "leading"
    }
}

fun getUserAccess(isAuthorized: Boolean, role: String) : String {
    return when {
        !isAuthorized -> "Restricted"
        role == "Admin" -> "Full"
        role == "Moderator" -> "Limited"
        else -> "Common"
    }
}


