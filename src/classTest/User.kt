package classTest//Конструктор по умолчанию  или же можно через метод init
//Можно поставить значение по умолчанию

/**
 * Модификаторы доступа
 * private -> внутри файла
 * protected -> видно в классах потомках
 * internal -> видно в рамках одного модуля
 * public -> виден везде
 *
 * private члены во вложеных классов не видны внешнему классу
 * после classTest.User можно поставить модификатор доступа
 */
class User (var firstName: String, var secondName: String) {

    //Если мы установим private для переменной, то ее не будет видно совсем извне, даже с сеттером
    var login : String? = null
        //Прописываем getter и setter для них можно устанавливать модификатор доступа
        private set(value){ //данное поле нельзя установить извне
            // можно написать field = value ?: "def"
            field = if (value.isNullOrEmpty()) "def" else value
        }
        get() = field

    constructor(): this("",""){ // значения по умолчанию
        //do something
    }

    constructor(firstName: String): this(firstName,"Copy")

    constructor(age: Int): this(){
        firstName = age.toString()
    }
}