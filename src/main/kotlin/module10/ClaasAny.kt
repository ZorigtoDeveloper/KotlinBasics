package module10

import `module6-objects`.Car

/*
    Any - корень иерархии всех классов в Kotlin. Все классы и обьекты неявно наследуются от класса Any

    В классе Any описаны 3 функции, которые доступны для любово обьекта:

    - функция equals
    - функция hashCode
    - функция toString
 */

fun main() {
    val car1 = Car(model = "Pego", color = "Yellow", brand = "m1")
    val car2 = Car(model = "BMV", color = "Black", brand = "X5")
    val car3 = car1

    println(car1 === car3)
    println(car1 === car2)

    val a = Car(model = "Pego", color = "Yellow", brand = "m1")
    val b = Car(model = "BMV", color = "Black", brand = "X5")

    a == b

    a?.equals(b) ?: b === null
}