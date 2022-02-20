package app.java

fun main() {
    /*
        1. copy

        fazendo a cópia do objeto (copy()) e podemos agora ter acesso as propriedades e reutilizá-los e podemos modificá-los
    */
    val user1 = User("Alberto", isAdmin = true, "Sanchez")

    val user2 = user1.copy(isAdmin = false)
    user2.last = "qualquer coisa"

    println("user1: $user1")
    println("user2: $user2")


    // temos um cenário na vida onde um cliente irá atualizar seu cartão de credito, e com isso, podemos utilizar do copy() e atualizar seu cartão
    val card1 = Card(213415, "02/28")
    val card2 = Card(53562, "07/31")

    val user5 = Human("Ruan", "Diniz", card1)
    val user5Copy = user5.copy(card = card2)

    println(user5)
    println(user5Copy)

    /*
        2. estrutura de dados simples
        pair - 2
        triple - 3
        Pair é DATA CLASS
        com Pair, trabalho com as propriedades em conjunto.

        Se trabalho com latitude, preciso de uma longitude, se tem eixo x, preciso de eixo y
    */

    // PAIR
    val x = arrayOf(54, 13, 43)
    val y = arrayOf(24, 87, 1324)

    val coordinates = Pair(x, y)

    println(coordinates.first[0])
    println(coordinates.second[0])

    val coordinates2 = x to y

    println(coordinates2.first[0])
    println(coordinates2.second[0])


    // TRIPLE

    val triple = Triple(1, 2, 3)
    val (B, A, C) = triple
    println("Triple - first: $A, second: $B, third: $C")
}

data class Human(var name: String, var isAdmin: Boolean, var lastName: String, var card: Card) {
    constructor(
        name: String,
        lastName: String,
        card: Card
    ) : this(
        name,
        isAdmin = false,
        lastName = lastName,
        card
    ) {
        this.card = card
    }

}

data class Card(val number: Int, val expiration: String)

