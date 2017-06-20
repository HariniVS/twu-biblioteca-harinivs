package com.twu.biblioteca.user;

import java.util.LinkedHashMap;

class UserCredential {

    private LinkedHashMap<User, Password> userCredentials;

    @Override
    public String toString() {
        return userCredentials.keySet() + " " +userCredentials.values();
    }

    public UserCredential() {
        addCredentials();
    }

    private void addCredentials() {
        userCredentials = new LinkedHashMap<>();
        final User user = new User("User 1", "user1@gmail.com", "Koramangala", 1234, "123-1234");
        userCredentials.put(user, new Password("1234"));
    }

    public LinkedHashMap<User, Password> getUserCredentials() {
        return userCredentials;
    }
}
