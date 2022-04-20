package `module9-interfaces-and-polymorphism`.lesson1

class DiskPhone : CallReceiver{
    override val vendor: String = "Tesla"

    override fun call(number: String) {
        println("disk phone calling $number")
    }
}