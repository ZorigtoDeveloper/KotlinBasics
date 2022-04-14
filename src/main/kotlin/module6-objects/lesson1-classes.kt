package `module6-objects`

/*
        Класс - это пользовательский тип данных
        - Описывает множество обьектов и операций над ними
        - Программист сам определяет, что и как будет описывать этот тип дпнных
        - ограничения - фантазия програмиста

 */

fun main() {
//    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
//    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
//    val bmw = Car(brand = "BMW", model = "X6")
//
//    printInfo(vw)
//    printInfo(lada)
//    printInfo(bmw)

//    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")

//    renault.currentSpeed = 1000.0
//    renault.currentSpeed = -1000.0

    println("current speed - ${renault.currentSpeed}")

//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")
//
//    renault.accelerate(100.0)
//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")
//
//    renault.decelerate(50.0)
//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")


//    printInfo(vw)
//    printInfo(renault)
}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")
}

/*
 Класс - это пользовательский тип данных. С помощью класса может быть описан абсолютно любой обьек или явление.
 Классы состоят из членов класса - полей и методов
 Чтобы создать класс, необходимо:
 - определить описываемый обьект
 - определить свойства этого обьекта
 - определить действия для этого обьекта
 Экземпляр - обьект класса. У экземпляра есть все описанные поля и методы класса.
 Внутреннее состояние - значение всех полей экземпляра в конкретный момент времени.
 */

/*
    Модификаторы доступа

    Public - доступен для все
    Protected - доступен только для членов класса и классов- потомков
    Internal - доступен для всех внутри модуля
    Private - доступен только внутри класса
 */