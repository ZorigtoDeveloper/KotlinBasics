package module2

fun main() {
    val number = 5

    val booleanExpression = true
    val isGreater: Boolean = 5 > 10
    val isEven = number % 2 == 0

    println(isGreater)
    println("$number is even - $isEven")

    var numberForCheck = -5
    var isPositiveOrEven = numberForCheck > 0 || numberForCheck % 2 == 0
    println("Is number positive or even? - $isPositiveOrEven")

    numberForCheck = -5
    var isPositive = numberForCheck > 0
    var isEvenTwo = numberForCheck % 2 == 0
    println("Is number positive or even? - ${isPositive || isEvenTwo}")

    numberForCheck = 10
    isPositive = numberForCheck > 0
    isEvenTwo = numberForCheck % 2 == 0
    println("Is number positive or even? - ${isPositive && isEvenTwo}")

}