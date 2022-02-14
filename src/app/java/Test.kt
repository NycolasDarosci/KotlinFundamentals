package app.java
/*
import app.java.User.lastName
import app.java.User.firstName
import app.java.Test
import java.util.ArrayList

*/


/*
class Test private constructor() {


        KOTLIN

    private var users: MutableList<User>? = null

    fun getUsers(): List<User>? {
        return users
    }

    val formattedUserNames: List<String?>
        get() {
            qq
            for ((firstName, lastName) in users!!) {
                var name: String
                name = if (lastName != null) {
                    if (firstName != null) {
                        firstName + " " + lastName
                    } else {
                        lastName
                    }
                } else if (firstName != null) {
                    firstName
                } else {
                    "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }

    companion object {
        private var INSTANCE: Test? = null
        val instance: Test?
            get() {
                if (INSTANCE == null) {
                    synchronized(Test::class.java) {
                        if (INSTANCE == null) {
                            INSTANCE = Test()
                        }
                    }
                }
                return INSTANCE
            }
    }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList()
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
    }
}

*/


/*

        JAVA

    private static Test INSTANCE = null;

    private List<User> users = null;

    public static Test getInstance() {
        if (INSTANCE == null) {
            synchronized (Test.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Test();
                }
            }
        }
        return INSTANCE;
    }

    // keeping the constructor private to enforce the usage of getInstance
    private Test() {

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

*/