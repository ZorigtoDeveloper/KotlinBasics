package module4

fun main() {
//    val n = readLine()?.toIntOrNull() ?: return
//
//    var i: Int = 0
//    var sum = 0
//    while (i <= 0) {
//        println(i)
//        sum += i
//        i++
//    }
//    println("Sum of first $n number - $sum ")
//
//    for (j in 0..n) {
//        if (j % 2 != 0) continue
//        println(j)
//        sum += j
//    }
//    println("Sum of first $n number - $sum ")

    doWhileFun()

}

fun doWhileFun() {
    var count = 0
    var sum = 0
    println("Enter a start number")
    var n = readLine()?.toIntOrNull() ?: return
    do {
        println("current number - $n")
        sum += n
        println("sum - $sum")
        n++
        count++
    } while (sum < 100)
    println("Number count - $count")
}