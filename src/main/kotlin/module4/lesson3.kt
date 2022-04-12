package module4

/*
     Map
     Представление, ассоциативный массив, словарь - структура данных,
     которая хранит элементы в виде пар "ключ-значение".
     Ключи уникальные, а значения могут дублироваться.
     Для разных ключей можно хранить одно и тоже значение.


 */

fun main() {
    val map = mapOf<Int, String>(1 to "2", Pair(2, "123"))
    val hashkMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val treeMap = sortedMapOf(1 to "one")
    val linkedHashMap = linkedMapOf<Int, Int>()

    val priceList = mutableMapOf<String, Int>(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )

    println(priceList)

    val priceListHash = hashMapOf<String, Int>(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )
    println(priceListHash)
    val priceListSorted = sortedMapOf<String, Int>(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )
    println(priceListSorted)

    priceList["Ice cream"] = 75
    priceList["Milk"] = 90

    println(priceList)
    priceList.remove("Yogurt")
    println(priceList)
    println(priceList.keys)
    println(priceList.values.maxOrNull())
    val maxValue = priceList.values.maxOrNull()
    println(priceList.filterValues { it == maxValue })

    for (entry in priceList.entries) {
        println("${entry.key} - ${entry.value}")
    }

    priceList.forEach { entry ->
        println("${entry.key} - ${entry.value}")
    }

    priceList.forEach { (key, value) ->
        println("$key - $value")
    }

    val sortedMap = priceList.toSortedMap()
    println(sortedMap)

    val sortedMapCom = priceList.toSortedMap(compareBy { it.length})
    println(sortedMapCom)

    val sortedMapComThen = priceList.toSortedMap(compareBy<String> { it.length}.thenBy { it })
    println(sortedMapComThen)


}