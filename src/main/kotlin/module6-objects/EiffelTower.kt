package `module6-objects`

object EiffelTower {
    var backlightsOn = false
    val height = 324
    fun turnOnBacklights() {
        println("backlights on")
        backlightsOn = true
    }

    fun turnOffBackLights() {
        println("backlights off")
        backlightsOn = false
    }
}