package module10.lesson3

/*
    Перечисление - это особый класс, который содержит в себе все возможные значения,
    которые описывает этот класс. Каждое значение перечисления представляет собой обьект класса перечисления:
    - нельзя создать обьект этого класса во время выполнения
    - обьект описывает внутри тела класса
    - являются обычными классами. Могут содержать функции, наследовать другие классы
    и реализовывать интерфейсы

 */

enum class Color(val hex: String) : Drawable {
    WHITE("#FFF"),
    BLACK("#000"),
    RED("#F00") {
        override fun draw() {
            println("Overridden draw fun")
        }
    },
    GREEN("#0F0"),
    BLUE("#00F");

    fun someMethod() {
        println("print something")
    }

    override fun draw() {
        println("draw color $hex")
    }
}