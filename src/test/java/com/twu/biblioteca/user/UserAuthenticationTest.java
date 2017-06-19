package com.twu.biblioteca.user;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserAuthenticationTest {

    @Test
    public void shouldAuthenticateValidUser() {
        new UserCredential();
        String userId = "123-1234";
        Password password = new Password("1234");

        UserAuthentication userAuthentication = new UserAuthentication(userId, password);
        assertTrue(userAuthentication.validateUser());
    }

    @Test
    public void shouldNotAuthenticateInvalidUser() {

    }
}
