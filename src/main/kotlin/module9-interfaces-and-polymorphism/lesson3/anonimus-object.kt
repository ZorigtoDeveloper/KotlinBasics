package `module9-interfaces-and-polymorphism`.lesson3

import `module9-interfaces-and-polymorphism`.lesson1.Callable

/*
    Ананимный класс - класс без имени, который используется для создания обьекта один раз

    С помощью анонимного класса можно:
    - создать обьект со своими полями и методами
    - создать обьект интерфейса или абстрактного класса, реализовав необходимые методы и свойства
    - наследоваться от существующего класса

    Обьект анонимного класса называют анонимным обьектом.

    Функциональный интерфейс(Single Abstract Method) - интерфейс, который имеет только одну абстрактныю функцию.
    Он может иметь несколько неабстрактных членов, но только одну абстрактную функцию.

 */

fun main() {
//    val anonymous = object : Callable {
//        val name = "anonymous"
//        val lastName = "object"
//        fun method() = println("anonymous object")
//        override val vendor = "anonymous vendor"
//
//        override fun call(number: String) {
//            println("anonymous object calling")
//        }
//
//    }
//
//    anonymous.name
//    anonymous.lastName
//    anonymous.method()
//
//    val test = AnonymousTest()
//    test.testMethod(anonymous)

    val evenChecker = IntPredicate { i -> i % 2 == 0 }

    println("8 is even - ${evenChecker.accept(8)}")
    println("9 is even - ${evenChecker.accept(9)}")

}

fun interface IntPredicate {
    fun accept(i: Int) : Boolean
}

class AnonymousTest {
    private fun createAnonymousObject() = object : Callable {
        val name = "anonymous"
        val lastName = "object"
        fun method() = println("anonymous object")
        override val vendor = "anonymous vendor"

        override fun call(number: String) {
            println("anonymous object calling")
        }
    }
//    private val anonymous = object : Callable {
//        val name = "anonymous"
//        val lastName = "object"
//        fun method() = println("anonymous object")
//        override val vendor = "anonymous vendor"
//
//        override fun call(number: String) {
//            println("anonymous object calling")
//        }
//    }

//    fun testMethod() {
//        anonymous.name
//        anonymous.lastName
//        anonymous.method()
//        anonymous.vendor
//        anonymous.call("")
//    }

    fun testMethod(obj: Callable) {
        obj.vendor
//        obj.name

        val objc = createAnonymousObject()
        objc.vendor
//        objc.name
        objc.name // с private можно обратиться
    }
}














