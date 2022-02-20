package app.java

/*
    OPÇÃO 1 - sem valor padrão + palavra constructor explicito
    class User constructor(var name: String)

    OPÇÃO 2 - valor padrão
    class User(var name: String = "")

    OPÇÃO 3 - espera que o construtor receba o valor (var)
*/

fun main() {
    val user1 = User("Jonas")
    val user2 = User("Jonas")

    println(user1)
    println(user2)

    // true
    println(user1 == user2)

    // se fosse 'class User'
    //println(user1 == user2) // false


    val user3 = User("Alberto", isAdmin = true, "Sanchez")

    // Desestruturação de classe (os atributos precisam seguir a ordem que foi declarado na classe para desestruturâ-lo)
    println("______________Funções ocultas_____________")
    println("utlizando component() - ${user3.component1()}")
    println("utlizando component() - ${user3.component2()}")
    println("utlizando component() - ${user3.component3()}")

    val (name, isAdmin, lastName) = user3

    println("meu nome $name $lastName e perfil é admin: $isAdmin")


}



// Data Class Vs Class
data class User(var name: String, var isAdmin: Boolean, var lastName: String) {

    constructor(name: String, lastName: String) : this(name, isAdmin = false , lastName = lastName ) {
        println("execute o construtor 2")
    }

    constructor(name: String) : this(name, "")


    // irei inicializar depois, mas se não o fizer, gera um erro
    lateinit var last: String

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

    fun getNameLength() = name.length

}




