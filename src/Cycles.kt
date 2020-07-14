fun main() {
    var items = 11

    while (items > 0){
        println(items)
        items--
    }

    println("Do While")
    do {
        println(items)
    }while (items == 5)

    println("For")
    for( i in 1..10 step 5)
        println(i)

    println("reverse")
    //обратный цикл
    for (i in 10 downTo 0 step 3)
        println(i)

    //По буквам
    for (i in 'a'..'x' step 2)
        println(i)

    // условие с диапазоном
    items = 10
    if(items in 10..20){
        println(items)
    }
}