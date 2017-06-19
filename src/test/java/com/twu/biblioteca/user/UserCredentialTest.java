package com.twu.biblioteca.user;

import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class UserCredentialTest {

    @Test
    public void shouldReturnUserCredentials() {
        UserCredential userCredential = new UserCredential();
        final LinkedHashMap<User, Password> userCredentials = userCredential.getUserCredentials();

        LinkedHashMap<User, Password> expectedUserCredentials = new LinkedHashMap<>();
        expectedUserCredentials.put(new User("User 1", "user1@gmail.com", "Koramangala",
                1234, "123-1234"), new Password("1234"));

        assertEquals(expectedUserCredentials.toString(), userCredentials.toString());
    }
}
