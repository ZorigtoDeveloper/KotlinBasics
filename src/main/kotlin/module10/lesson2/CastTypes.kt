package module10.lesson2

import `module7-oop`.Developer
import `module7-oop`.Person

/*
    Для проверки типа используются оператор is или его негативная версия !is

    Приведение типа - представление обьекта одного типа в виде обьекта другого типа.
    Приведение типа доступно только для типов, которые находятся в одной иерархии
    Существуют 2 вида приведения:
    - расширяющее (upcase) - приведение обьекта производного класса к базовому, вверх по иерархии
    - сужающее (downcase) - приведение обьекта базового класса к производному, вниз


 */

fun main() {
//    val developer = Developer("Tony", 40)
//    developer.writeCode()
//    developer.getLevel()
//
//    val person: Person = developer

    val person: Person = Developer("Tony", 40)
    val developer: Developer? = person as? Developer

    developer?.writeCode()
    println(developer?.getLevel())

}