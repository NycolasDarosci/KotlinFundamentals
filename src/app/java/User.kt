package app.java

/*
    OPÇÃO 1 - sem valor padrão + palavra constructor explicito
    class User constructor(var name: String)

    OPÇÃO 2 - valor padrão
    class User(var name: String = "")

    OPÇÃO 3 - espera que o construtor receba o valor (var)
*/

class User(var name: String, var isAdmin: Boolean) {

    constructor(name: String) : this(name, isAdmin = false) {
        println("execute o construtor 2")
    }

    constructor() : this("Desconhecido") {
        println("Execute o construtor 3")
    }

    // irei inicializar depois, mas se não o fizer, gera um erro
    lateinit var lastName: String

    // PROPRIEDADES E COMPORTAMENTOS DA CLASSE
    companion object {
        var count = 0

        fun resetCount() {
            println("____ resetting count.. ")
             count = 0
         }
    }

    init {
        count++
        println("initializing.. $count")
    }

    fun output() = println("Meu nome é $name $lastName, sou admin: $isAdmin")

    fun printUpperCase() = println("Olá ${name.uppercase()}")

    fun getNameLength(): Int {
        return name.length
    }
}




