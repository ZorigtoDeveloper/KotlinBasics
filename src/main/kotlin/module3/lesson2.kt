package module3

fun main() {
    println(test())

    val type: (Int) -> String

    anonimous(123)

    val str = "This is a typical task for developer interview"
    //println( str.count { char -> checkSymbol(char) })
    // println( str.count { checkSymbol(it) })
    println( str.count { it == 'e'})

    val vowels = "aeoiu"
    println(str.filter { it !in vowels })
}

fun checkSymbol(char: Char) : Boolean = char == 'e'

fun test() {

}

fun multiply(func: () -> Unit) {}

// Анонимная функция - функция, у которой нет имени. Оброщение к этой функции происходит с помощью переменной
// функционального типа
val anonimous: (Int) -> Unit = fun(a: Int) { println(a) }

val lamda = { println("HelloWorld") }
val lambdaWithParams = { message: String -> println(message) }
val lambdaWithParamAndReturnValue = { a: Int, b: Int -> a * b}
