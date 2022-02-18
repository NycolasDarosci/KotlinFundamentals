package app.java

fun main(){
    val test1 = User("Mateus")
    val test2 = User()
    val test3 = User()

    /*
        ACESSANDO PROPRIEDADES E COMPORTAMENTOS DA CLASSE
    */
    User.resetCount()
    Database.MAX_NAME_LENGTH

    val tes1 = User("Carlos")
    login(tes1)
    tes1.output()

    val tes2 = User("Jose")
    login(tes2)

    val tes3 = User("Maria")
    login(tes3)

    println(Database.users.map { it.name }[1])

}

fun login(test: User) {
    Database.users.add(test)
}