package app.java

fun main(){
    val test1 = Test("Mateus")
    val test2 = Test()
    val test3 = Test()

    /*
        ACESSANDO PROPRIEDADES E COMPORTAMENTOS DA CLASSE
    */
    Test.resetCount()
    Database.MAX_NAME_LENGTH

    val tes1 = Test("Carlos")
    login(tes1)
    println(Database.test?.name)

    val tes2 = Test("Jose")
    login(tes2)
    println(Database.test?.name)

    val tes3 = Test("Maria")
    login(tes3)
    println(Database.test?.name)

}

fun login(test: Test) {
    Database.test = test
}