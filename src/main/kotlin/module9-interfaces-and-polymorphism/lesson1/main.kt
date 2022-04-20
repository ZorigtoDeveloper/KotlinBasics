package `module9-interfaces-and-polymorphism`.lesson1

fun main() {
    val devices = listOf(MobilePhone(), AppleWatch(), DiskPhone(), SmartFridge())
    devices.forEach { it.call("+7(999)999-99-99") }

    val webBrowsers = listOf<WebBrowser>(SmartTV(), MobilePhone())
    webBrowsers.forEach {
        it.playVideo("www.example.com")
    }
}