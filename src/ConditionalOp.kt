fun main() {
    var word: String? = null

    if(word == null)
        print("null")
    else
        println(word)

    // switch keys
    // Можно присвоить результат переменной 
    val a = 2
    when(a){
        5 -> print("Отл")
        2 -> print("Не удовл")
        else -> print("Что-то не то")
    }

    // тернарый оператор
    var res = if(a == 2) a else 0
}