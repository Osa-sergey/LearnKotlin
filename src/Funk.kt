fun main() {
    var a: Int = 5
    var b: Int = 4
    println(add(a,b))
    print(sayWow("Oh"))
}

// Возвращаемое значение Int
fun add(a: Int, b: Int): Int{
    return a + b
}

// Синтаксис для одной строки
fun sayWow(str: String): String ="$str Wow"
