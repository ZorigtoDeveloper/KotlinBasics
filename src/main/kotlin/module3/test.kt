package module3

fun main() {
    val result: Int = multiply(1234, 2345)
    println(result)
    println(multiply(1234, 2345))
}

fun multiply(a: Int, b: Int) : Int = a * b

fun multiply(a: Int, b: Double) : Int = (a * b).toInt()
fun multiply(a: Double, b: Int, c: Int): Double = a * b * c