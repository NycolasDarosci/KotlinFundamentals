package app.java

/*
    OBJETO ÚNICO, é instanciado uma única vez
*/
object Database {
    var name = "Desconhecido"
    var users: MutableList<User> = mutableListOf()

    const val MAX_NAME_LENGTH = 8

}