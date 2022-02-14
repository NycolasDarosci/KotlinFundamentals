package app.java

import java.util.ArrayList

/*
        THE RESULT
    init block don't exist because we can
    be instantiating the _users list with users directly in the
    declaration
*/

val User.formattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }

object Repository {

    private val _users = mutableListOf(User("Jane", ""), User("John", null), User("Anne", "Doe"))
    val users: List<User>
        get() = _users

    val formattedUserNames: List<String>
        get() = _users.map { user -> user.formattedName }
}

/*
                ALL THE PROCESS

     EXTENSION FUNCTIONS

     Kotlin provides the ability to declare functions and
     properties outside any class, object, or interface.

     In Kotlin you can declare top-level functions, without having a class.
     However, Kotlin also provides the ability to create extension functions.
     These are functions that extend a certain type but are declared outside the type.

        User.formattedName

val User.formattedName: String
    get() {
        return if(lastName != null){
            if(firstName != null){
                "$firstName $lastName"
            }else{
                /*
                        ELVIS OPERATOR
                    - retorna a expressão à esquerda se NÃO for nula
                        ou
                    - retorna à direita se a esquerda for nula

                    else if(firstName != null){
                        firstName
                    }else{
                        "Unknown"
                    }
                */
                lastName  ?: "Unknown"
            }
        } else{
            firstName ?: "Unknown"
        }
    }
/*

    Because we need only one instance of the Repository class,
    we used the singleton pattern in Java.

    With Kotlin, you can enforce this pattern at the compiler level
    by replacing the class keyword with object.

*/

/*
    replacing
    'class Repository private constructor()'
        by
    'object Repository'

    we can remove companion object as well
*/

object Repository {

    /*
        é null, pois o objeto não foi instanciado no momento da declaração
        'private var users: MutableList<User>? = null'

        can use mutableListOf function and provide the list element type.
        mutableListOf creates an empty list that can hold User objects

        'private val users: MutableList<User> = mutableListOf<User>()'

        como a variavel 'users' já está inicializada, posso remover
        a inicialização do init 'users = ArrayList<Any?>()'
    */

    /*
        fun getUsers(): List<User>? {
           return users
        }


        the private _users property becomes
        the backing property(propriedade de apoio)
        for the public users property.

        consumers of the class can acess the list only
        through users
    */
    private val _users = mutableListOf<User>()
    val users: List<User>
        get() = _users


    /*
        o método getFormattedUserNames(), agora é uma propriedade (property) 'val'

        Kotlin allows us to have a better differentiation between
        properties of a class, expressed with FIELDS, and
        functionalities, actions that a class can do, expressed with FUNCTIONS.

        In our case, the Repository class is very simple
        and DOESN'T DO ANY ACTIONS so it only has fields.
     */
    val formattedUserNames: List<String>


            /*
                MAP FUNCTION
            This function returns a new list containing the
            results of applying the given transform function to each element
            in the original list.
            So, instead of creating a new list
                'val userNames = ArrayList<String>(users.size)'
            and iterating through the list
                - DESTRUCTURING ((firstName, lastName))
                'for ((firstName, lastName) in users)'
            of users manually, we can use the map function and
            move the logic we had in the for loop inside the map body.
            By default, the name of the current list item used in map is it,
            but for readability you can replace it with your own variable name.
            In our case, let's name it user

                return users.map { user ->
            */
        get() {
                //val userNames: MutableList<String?> = ArrayList(users!!.size)
            return _users.map { user -> user.formattedName }
        }

    /*
        the static field is now part of a companion object block

            STATIC
        in Java, we use the static keyword for fields or functions to say that
        they belong to a class but not to an instance of the class
        This is why we created the INSTANCE static field in our Repository class.
        The Kotlin equivalent for this is the companion object block.
        Here you would also declare the static fields and static functions.
        The converter created the companion object block and moved the INSTANCE field here.

            SINGLETON PATTERN
    is a software design pattern that restricts the
    instantiation of a class to one "single" instance.

    companion object {
        private var INSTANCE: Repository? = null
        val instance: Repository?
            get() {
                if (INSTANCE == null) {
                    synchronized(Repository::class.java) {
                        if (INSTANCE == null) {
                            INSTANCE = Repository()
                        }
                    }
                }
                return INSTANCE
            }
    }
    */


    /*
        keeping the constructor private to enforce the usage of getInstance

             private Repository()
        the primary constructor cannot contain any code, so initialization code
        is placed in init blocks
    */
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User(null, "Doe")

        _users.apply {
            add(user1)
            add(user2)
            add(user3)
        }
    }


}
*/


/*

    JAVA

public class Repository {
    private static Repository INSTANCE = null;

    private List<User> users = null;

    public static Repository getInstance() {
        if (INSTANCE == null) {
            synchronized (Repository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Repository();
                }
            }
        }
        return INSTANCE;
    }

    // keeping the constructor private to enforce the usage of getInstance
    private Repository() {

        User user1 = new User("Jane", "");
        User user2 = new User("John", null);
        User user3 = new User("Anne", "Doe");

        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<String> getFormattedUserNames() {
        List<String> userNames = new ArrayList<>(users.size());
        for (User user : users) {
            String name;

            if (user.getLastName() != null) {
                if (user.getFirstName() != null) {
                    name = user.getFirstName() + " " + user.getLastName();
                } else {
                    name = user.getLastName();
                }
            } else if (user.getFirstName() != null) {
                name = user.getFirstName();
            } else {
                name = "Unknown";
            }
            userNames.add(name);
        }
        return userNames;
    }

}
*/