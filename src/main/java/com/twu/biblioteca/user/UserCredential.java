package com.twu.biblioteca.user;

import java.util.LinkedHashMap;

class UserCredential {

    private LinkedHashMap<String, String> userCredentials;

    public UserCredential() {
        addCredentials();
    }

    private void addCredentials() {
        userCredentials = new LinkedHashMap<>();
        userCredentials.put(new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234").getUserId(),
                "1234");
    }

    public LinkedHashMap<String, String> getUserCredentials() {
        return userCredentials;
    }
}
