package module10.lesson5

/*
    Расширения - выражения, которые позволяют добовлять в класс новую функциональность
     без наследования этого класса
 */

fun main() {

}

//fun Int.isEven() : Boolean {
//    return  this % 2 == 0
//}

fun printNumber(number: Int) {
//    println(number.isEven())
//    println(5.isEven())

    val a = Int.random()

    number.isEven
    5.isEven
}

fun Int.Companion.random(): Int {
    return (System.currentTimeMillis() % 43).toInt()
}

val Int.isEven
    get() = this % 2 == 0