package `module9-interfaces-and-polymorphism`.lesson1

interface CallReceiver : Callable {
    fun receiveCall(number: String) {
        println("$vendor receive call from $number")
    }
}