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

enum class CreditCard(val label: String) {
    VISA("Visa"),
    MASTER("Mastercard"),
    ELO("Elo"),
    AMEX("American Express")
}

fun main (){
    val sax = Musician.Sax()


    val kiko = Musician()
    kiko.desc()

    val guitar = kiko.Guitar()
    guitar.desc()

}