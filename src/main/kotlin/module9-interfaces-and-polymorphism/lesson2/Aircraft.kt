package `module9-interfaces-and-polymorphism`.lesson2

abstract class Aircraft(maxWeightArg: Int) : Transporter(maxWeightArg) {

    abstract val brand: String
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int

    abstract val rows: Int
    abstract val numberOfSeatsInRow: Int

    protected val seatScheme by lazy {
        List(rows) {
            MutableList<Passenger?>(numberOfSeatsInRow) {
                null
            }
        }
    }

    fun addPassenger(passenger: Passenger) {
        val row = passenger.seat.row
        val number = passenger.seat.letter - 'A'
        seatScheme[row][number] = passenger
    }

    fun getPassenger(seat: Seat): Passenger? {
        val row = seat.row
        val number = seat.letter - 'A'
        return seatScheme[row][number]
    }

    abstract fun getSeatScheme()

    fun getInfo() = """Aircraft: $brand $model
        |Max Weight $maxWeight
        |Capacity: $capacity
        |Number of rows: $rows
        |Number of seats in a rows: $numberOfSeatsInRow
    """.trimMargin()

    override fun move() {
        println("Aircraft flying")
    }

    fun getAvailableSeat(): Seat? {
        val availabSeat = mutableListOf<Seat>()
        seatScheme.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { seatIndex, passenger ->
                if (passenger == null)
                    availabSeat.add(Seat(rowIndex, 'A' + seatIndex))
            }
        }
        return availabSeat.randomOrNull()
    }
}

