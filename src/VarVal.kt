

fun main(args: Array<String>) {

    //Изменяемые переменные объявляются с помощью var
    var age: Int = 20
    // Работает базовое сокращение из Java
    //старый вариант конкатинации
    println("Мой возраст " + age)
    //новый вариант конкатинации
    println("Мой возраст $age")

    /**
     *  Переменная должна быть инициализированна
     */
    //var a: Int
    // println(a)

    //Типы данных String, Char, Boolean, Int, Double, Float,Short,Long и т.д
    //Нужна буква
    var num: Float = 4.25f

    //аналог final переменных в Java
    val firstNumber: Int
    firstNumber = 5
    println(firstNumber)
    // не будет работать
    // firstNumber = 3

    //Знак ? обеспечивает возможность положить в переменную null
    var nNull: Int? = null
    println(nNull)

    nNull = 5
    println(nNull)

    // можно не указывать тип данных, если сразу идет инициализация
    var str = "String"
    println(str)
}