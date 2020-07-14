fun main() {
    /**
     * Обычный массив немутабельный
     */
    var items: Array<String> = arrayOf("Hi","My","Beauty","World")
    //Без объявления типа
    var items_1 = arrayOf(1)
    println(items.size)
    println(items[0])
    println(items.get(0))
    items.set(0,"o")
    println(items[0])
    // цикл
    for (item in items)
        print("$item ")

    println(items_1[0])

    //цикл foreach
    //в данном случае foreach лямбда-функция
    items.forEach { element ->
        println(element)
    }

    //вывод с индексом
    items.forEachIndexed {index: Int, s: String ->
        println("индекс $index содержит $s")
    }

    /**
     * Листы немутабельный
     */
    var items_list = listOf(5,7,6,1)

    /**
     * Map ассоциативный массив ключ to значение
     * Any позволяет хранить любой тип данных (аналог object)
     */
    var items_map: Map<String, Any> = mapOf("name" to "Serg", "age" to 20)

    items_map.forEach {key, value -> println("$key: $value")}

    /**
     * Мутабельные списки
     */
    var mutableList_my = mutableListOf<Any>(1,2,3)
    mutableList_my.add(4)
    mutableList_my.add("My List")
    mutableList_my.forEach {i ->
        println(i)
    }
}