package com.twu.biblioteca.user;

import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class UserCredentialTest {

    @Test
    public void shouldReturnUserCredentials() {
        UserCredential userCredential = new UserCredential();
        final LinkedHashMap<String, String> userCredentials = userCredential.getUserCredentials();

        LinkedHashMap<String, String> expectedUserCredentials = new LinkedHashMap<>();
        expectedUserCredentials.put(new User("User 1", "user1@gmail.com", "Koramangala",
                1234, "123-1234").getUserId(), "1234");

        assertEquals(expectedUserCredentials, userCredentials);
    }

    @Test
    public void shouldReturnPassword() {
        UserCredential userCredential = new UserCredential();
        final LinkedHashMap<String, String> userCredentials = userCredential.getUserCredentials();

        String expectedPassword = "1234";

        assertEquals(expectedPassword, userCredentials.get("123-1234"));
    }
}
