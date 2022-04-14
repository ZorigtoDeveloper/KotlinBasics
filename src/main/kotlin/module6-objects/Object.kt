package `module6-objects`

/*
    Object в отличие от класса описывает всего один обьект а не много
    Синглтон - обьект, который существует в единственном экземпларе во время работы программы.
    -Состоит из полей и методов
    - Нельзя создать экземпляр
    - Обращение к полям и методам через имя обьекта
    - Могут применяться модификаторы доступа: private, public, internal

 */

/*
    Компаньон - обьект, который обьявлен внутри тела класса.
    - Состоит из полей и методов
    - Нельзя создать экземпляр
    - Может не иметь имени
    - Обращение к полям и методам через имя класса, в котором он обьявлен
    - Могут применяться модификаторы доступа
 */

fun main() {
//    println("Height - ${EiffelTower.height}")
//    EiffelTower.turnOnBacklights()
//    EiffelTower.turnOffBackLights()

    val tower1 = EiffelTower
    val tower2 = EiffelTower

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower1 backlights on? - ${tower2.backlightsOn}")

    tower1.turnOnBacklights()

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower1 backlights on? - ${tower2.backlightsOn}")

    println("Wheels count - ${Car.wheelsCount}")
    val classType = Car.getCarClass(3.8)
    println(classType)
}