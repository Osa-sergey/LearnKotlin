fun main() {
    //Обычный массив
    var items: Array<String> = arrayOf("Hi","My","Beauty","World")
    println(items.size)
    println(items[0])
    println(items.get(0))
    items.set(0,"o")
    println(items[0])
}