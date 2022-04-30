package module10.lesson3.SealedCalss

/*
Изолированый класс используется для отображения ограниченной иерархии классов, когда значение может иметь тип
только из ограниченного набора и никакое другое:
- наследники известны в момент компиляции
- наследниками могут быть обьекты-синглтоны или классы
- нельзя создать экземпляр изолированого класса

 */

sealed class SealedColor(val hex: String) {
    object White : SealedColor("#FFF")
    object Black : SealedColor("#000")
    object Red : SealedColor("#F00")
    object Green : SealedColor("#0F0")
    object Blue : SealedColor("#00F")

    class CustomColor(hex: String) : SealedColor(hex)


}