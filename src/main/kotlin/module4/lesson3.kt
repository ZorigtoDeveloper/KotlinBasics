package module4

fun main() {
    var n = readLine()?.toIntOrNull() ?: return

//    while (n > 0) {
//        n = 0
//    }

  //  printNumbers(n)
    println(calculateSum(n))
}

fun printNumbers(number: Int): Int {
    if (number > 0) {
        println(number)
        return printNumbers(number - 1)
    }
    else return 0
}

tailrec fun calculateSum(n: Int, currentSum: Int = 0) : Int {
    if (n == 0) return currentSum
    return calculateSum(n - 1, currentSum + n)
}