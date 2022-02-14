package app.java

// extension function
val User.getFormattedName: String
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


// extension property
val User.userFormattedName: String
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

// usage:
val user = User(firstName = "", lastName = "")
val name = user.getFormattedName
val formattedName = user.userFormattedName