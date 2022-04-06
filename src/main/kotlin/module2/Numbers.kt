package module2

// типы данных это множество значений и оперций над этими значениями
// который описывае какой то реальный обьект или явление
// например тип Int описывает значения в диапозоне -2 миллиарда до 2 миллиарда
// и операции над этими числами +, -, /, *, %

// Типы данных. Числа
// Целые числа:
// Byte (-127..128)
// Short(-32768..32767)
// Int(-2,147,483,648(-231)..2,147,483,647(221-1))
// Long()

// Числа с плавоющей точкой
// Float
// Double

fun main() {
    val number = 10000 // Int
    val namberLong = 10000L // Long

    val doubleNumber = 2.0 // Double
    val floatNumber: Float = 2.0f // Float

    val longNumber: Long = number.toLong()

    val a = 5
    val b = 11
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("b / a = ${b / a}")
    println("b / a = ${b / a.toDouble()}")
    println("b % a = ${b % a}")

    a==b
    a!=b
    a>b
    a<b
    a>=b
    a<=b

}
