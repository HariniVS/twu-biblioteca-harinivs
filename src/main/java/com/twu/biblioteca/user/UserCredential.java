package com.twu.biblioteca.user;

import java.util.LinkedHashMap;
import java.util.Map;

class UserCredential {

    private Map<User, Password> userCredentials;

    @Override
    public String toString() {
        return userCredentials.keySet() + " " +userCredentials.values();
    }

    UserCredential() {
        addCredentials();
    }

    private void addCredentials() {
        userCredentials = new LinkedHashMap<>();
        final User user = new User("User 1", "user1@gmail.com", "Koramangala", 1234, "123-1234");
        final Librarian librarian = new Librarian("Lib 1", "lib1@gmail.com", "Koramangala", 4567, "456-4567");
        userCredentials.put(user, new Password("1234"));
        userCredentials.put(librarian, new Password("4567"));
    }

    Map<User, Password> getUserCredentials() {
        return userCredentials;
    }
}
