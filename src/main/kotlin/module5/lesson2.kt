package module5


import kotlin.random.Random

/*  Массив - это структура данных фиксированного размера, в памяти которой друг за другом хранятся элементы одного типа.
Это примитивная базовая коллекция. Все остальные коллекции основываются на массиве.
- Доступ к элементау по индексу
- Нельзя изменять размер массива
- Можно изменять элементы массива

List
Список - это структура данных переменного размера, в памяти которой друг за другом хранятся элементы одного типа.
В отличие от массива размер списков может увеличиваться и уменьшаться.
Основан на массиве. Может быть изменяем (mutable) и неизменяем (immutable).

 */

fun main() {
    val list = listOf(1, 2, 3, 4)
    val carList = listOf<String>("Mercedes", "BMW", "Ferrari")

    val emptyList = listOf<String>()
    val secondEmptyList = emptyList<String>()

    val secondList = List(5) { 0 }
    val secondCarList = List<String>(3) { index -> "Car №${index}" }

    val mutableList = mutableListOf<Int>(1, 2, 3, 4)
    val mutableCarList = mutableListOf<String>("Mercedes", "BMW", "Ferrari")

    val mutableSecondList = MutableList(5) { 0 }
    val mutableSecondCarList = MutableList(3) { index -> "Car №${index}" }

    val list2 = listOf(1, 2, 3, 4, 5)
    val mutableList2 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // list2[1] = 4 нельзя поменять
    println(mutableList2.size)
    mutableList2[1] = 4
    mutableList2.add(6)
    mutableList2.add(7)
    println(mutableList2.size)
    println(mutableList2.joinToString(","))

    println(list2[list2.lastIndex])

    for (i in list2.indices) {
        println(list2[i] * i)
    }

    list2.forEach { item -> println(item) }
    list2.forEachIndexed { index, i ->
        println(i * index)
    }

    println(list2.sumBy { it * 5 } )
    println(carList.sumBy { it.length })

    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
//    numbers.forEach {
//        if (it < 0)
//            numbers.remove(it)        вызовет ошибку
//    }
    val candidatesToRemove = mutableListOf<Int>()
    numbers.forEach {
        if (it < 0)
            candidatesToRemove.add(it)
    }
    numbers.removeAll(candidatesToRemove)
    println(numbers)

    val numbers2 = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers2)
    val iterator = numbers2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item < 0)
            iterator.remove()
    }
    println(numbers2)

    val numbers3 = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers3)
    numbers3.removeAll { it < 0 }
    println(numbers)

    val list4 = listOf(1, 2, 3, 4, 5)
    val mutableList4 = list4.toMutableList()

    val stringList = list.map {
        "This was a number $it"
    }
    stringList.forEach { println(it) }

    val mutableStringList = stringList.toMutableList()
    mutableStringList.add("new string")

    mutableStringList.forEach { println(it) }

    /*
    LinkedList
    Связный список - список, в котором каждый элемент имеет ссылки на предыдущий и следущий элементы.
    - Операции добавления и удаления происходят быстрее
    - Получение и изменение элемента происходит медленее

    Queue
    Очередь - структура данных, работающая по принципу First In - First Out (первый вошел - первый вышел).
    Элементы добавляются в конец очереди, а извлекаются из ее начала.

    Stack
    Стек - структура данных, работающая по принципу Last In - First Out (последний вошел - первый вышел).


     */
}