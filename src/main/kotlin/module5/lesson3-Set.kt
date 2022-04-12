package module4

import java.util.TreeSet

/*
    Set
    Множество - структура данных, которая хранит набор уникальных значений.
     */

fun main() {
    val set = setOf(1, 2, 2, 3, 1, 2)
    val hashSet = hashSetOf(1, 2, 3, 3, 2, 1)
    val sortedSet = sortedSetOf(1, 2, 3, 3, 2, 1).toSet()
    val linkedSet = linkedSetOf(1, 2, 3, 3,2, 1)

    val hasSet2 = HashSet<String>()
    val sortedSet2 = TreeSet<String>()
    val linkedSet2 = LinkedHashSet<String>()

    val firstSet = setOf(1, 2, 3, 4)
    val secondSet = setOf(3, 4, 5, 6)

    val unionSet = firstSet.union(secondSet)
    val substract = firstSet.subtract(secondSet)
    val intersect = firstSet.intersect(secondSet)

    val northBusSet = setOf(1, 4, 5, 6, 12, 13, 16, 19, 20)
    val southBusSet = setOf(1, 2, 3, 7, 4, 5, 6, 7, 8, 16, 19, 20, 31)

    val onlyNorthBus = northBusSet.subtract(southBusSet)
    val onlySouthBus = southBusSet.subtract(northBusSet)
    val globalBus = northBusSet.intersect(southBusSet)

    println(onlyNorthBus)
    println(onlySouthBus)
    println(globalBus)

}