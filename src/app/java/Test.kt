package app.java

/*
    OPÇÃO 1 - sem valor padrão + palavra constructor explicito
    class Test constructor(var name: String)

    OPÇÃO 2 - valor padrão
    class Test(var name: String = "")

    OPÇÃO 3 - espera que o construtor receba o valor (var)
*/

class Test(var name: String, var isAdmin: Boolean) {

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

    constructor(name: String) : this(name, isAdmin = false) {
        println("execute o construtor 2")
    }

    constructor() : this("Desconhecido") {
        println("Execute o construtor 3")
    }

    fun output() = println("Meu nome é $name $lastName, sou admin: $isAdmin")

    fun printUpperCase() = println("Olá ${name.uppercase()}")

    fun getNameLength(): Int {
        return name.length
    }
}
