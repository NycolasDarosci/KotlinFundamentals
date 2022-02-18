package app.java

/*
        VAR AND GETTER, SETTER
    class java Use: had a getter and setters, making its value mutable
    class Kotlin Use: Kotlin keyword for mutable variables is var

    if Java properties had only getters, they would be immutable and Kotlin
    would have been declared as val. Val is similar to the final keyword in Java


        NULL VALUE
    Kotlin explicitly specifies whether a variable can accept a null value.
    It does by appending(anexando, acrescentando) a '?' to the type declaration


        DATA CLASS
    Use class only holds data(contém apenas dados).
    By marking this class as data, the compiler will automatically create
    getters and setters. It will also derive equals(), hashCode() and toString()


        CONSTRUCTOR
    Kotlin can have a primary constructor and one or more secondary constructor
*/
data class Person(var firstName: String?, var lastName: String? )

val user1: Person = Person(firstName =  null, lastName = "");
val user2: Person = Person(lastName = "Marcel", firstName = null); // same as Use("null, Marcel")

/*
        EQUALITY

    * Structural equality '==', calls equals() to determine if two
    instances are equal
        val structurally = user1 == user2 //true

    * Referential equality '===', checks if two references point to
    the same object
        val referentially = user1 === user2 //false
*/

val structurally = user1 == user2 //true
val referentially = user1 === user2 //false


fun main(){
    println(structurally)
    println(referentially)


    user1.firstName = "Nycolas"
    user1.lastName = "Alberto"

    println(user1.firstName)
    println(user1.lastName)
}

/*public class Use {

    @Nullable
    private String firstName;
    @Nullable
    private String lastName;

    public Use(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}*/