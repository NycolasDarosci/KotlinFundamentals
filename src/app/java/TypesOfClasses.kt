package app.java

/*
    TIPOS DE CLASSES

    1. CLASSES ANINHADAS (Nested Class)

    2. CLASSES INTERNAS (Inner Class - acesso as propriedades da classe relacionada)
          Só consegue acessar as propriedades de uma Inner Class se o objeto relacionado
          (A classe mãe) for instanciada:
              val kiko = Musician()
              val guitar = kiko.Guitar()

    3. CLASSES ENUMERADAS (Enum)

    4. DATA CLASSES

    5. DESESTRUTURAÇÃO DE CLASSES

    6. FUNÇÕES OCULTAS
*/

class Musician {
    var style = "Rock"

    fun desc() = println("Meu estilo é $style")

    inner class Guitar {
        var strings = 6

        fun desc() = println("tocando uma guitara com $strings cordas. E o estilo de música é $style")
    }

    class Sax {
        var number = 1
    }
}

enum class CreditCard(val label: String, val discount: Int) {
    VISA("Visa", 10),
    MASTER("Mastercard", 5),
    ELO("Elo", 5),
    AMEX("American Express", 10)
}

fun main (){
    val sax = Musician.Sax()


    val kiko = Musician()
    kiko.desc()

    val guitar = kiko.Guitar()
    guitar.desc()


    val creditCardAPIName = "master"

    val card = CreditCard.valueOf(creditCardAPIName.uppercase())

    val discount = when(card) {
        CreditCard.VISA -> "Você recebeu um desconto de ${card.discount}"
        CreditCard.ELO -> "Você recebeu um desconto de ${card.discount}"
        else -> "Você está utilizando o cartão ${card.label}"
    }

    /*
    val discount = if(card == CreditCard.VISA) {
        "Você recebeu um desconto de ${card.discount}"
    }
    else if (card == CreditCard.ELO) {
        "Você recebeu um desconto de ${card.discount}"
    }
    else {
        println("Avisa o usuário que o cartão VISA tem desconto")
        "Você está utilizando o cartão ${card.label}"
    }
    */
    println(discount)
}