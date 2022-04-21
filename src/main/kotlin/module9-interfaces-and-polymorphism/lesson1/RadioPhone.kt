package `module9-interfaces-and-polymorphism`.lesson1

class RadioPhone : CallReceiver {
    override val vendor: String = "Panasonic"

    override fun call(number: String) {
        println("radio phone calling $number")
    }
}