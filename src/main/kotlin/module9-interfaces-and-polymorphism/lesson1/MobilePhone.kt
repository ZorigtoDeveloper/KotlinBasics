package `module9-interfaces-and-polymorphism`.lesson1

class MobilePhone : CallReceiver, WebBrowser {
    override val vendor: String = "Samsung"

    override fun call(number: String) {
        println("mobile phone calling $number")
    }

    override fun receiveCall(number: String) {
        super.receiveCall(number)
        println("LED on")
    }
    override fun playVideo(url: String) {
        println("Mobile phone playing video from $url")
    }

}