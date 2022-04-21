package `module9-interfaces-and-polymorphism`.lesson2

import kotlin.random.Random

fun main() {

    val boeing737 = createAndFillBoeing()
    println(boeing737.getInfo())
    boeing737.getSeatScheme()
    boeing737.getPassenger(Seat(0, 'c'))
        ?.getInfo()
        ?.let { println(it) }
        ?: println("There is no passenger")

    println("=====================================")

    val zeppelin = createAndFillZeppelin()
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
    zeppelin.getPassenger(Seat(0, 'c'))
        ?.getInfo()
        ?.let { println(it) }
        ?: println("There is no passenger")
}

fun createAndFillBoeing(): Boeing737 {
    val boeing737 = Boeing737()
    val passengerCount = Random.nextInt(1, boeing737.capacity)
    for (i in 0 until passengerCount) {

        val seat = boeing737.getAvailableSeat() ?: return boeing737

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = ForeignPassport(
                series = Random.nextInt(1000, 9000).toString(),
                number = Random.nextInt(10000, 999999).toString()
            ),
            seat = seat
        )
        boeing737.addPassenger(passenger)


    }
    return boeing737
}

fun createAndFillZeppelin(): Zeppelin {
    val zeppelin = Zeppelin()
    val zeppelinPassengers = Random.nextInt(1, zeppelin.capacity)
    for (i in 0 until zeppelinPassengers) {

        val seat = zeppelin.getAvailableSeat() ?: return zeppelin

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = DeputyID(
                number = Random.nextInt(100000, 999999).toString()
            ),
            seat = seat
        )
        zeppelin.addPassenger(passenger)
    }

    return zeppelin
}
