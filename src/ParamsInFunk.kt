fun main() {
    printSomething("Hello", "My")

    //Мы можем передавать массив как varargs используя оператор *
    var items = arrayOf("1","2","3","4")
    printSomething(*items)

    //с указанием параметров
    printSome(str1 = "Second", str = "First")
    //со значением по умолчанию
    printS()
    printS("Hi")
}

/**
 * Использование varargs аналогично java
 */
fun printSomething(vararg word: String){
    word.forEach { w -> println(w) }
}

fun printSome(str: String, str1: String){
    println("$str + $str1")
}

fun printS(str: String = "Hello"){
    println(str)
}