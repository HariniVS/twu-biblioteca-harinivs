package com.twu.biblioteca.user;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserAuthenticationTest {

    @Test
    public void shouldAuthenticateValidUser() {
        new UserCredential();
        String userId = "123-1234";
        Password password = new Password("1234");

        UserAuthentication userAuthentication = new UserAuthentication();
        assertTrue(userAuthentication.authenticate(userId, password));
    }

    @Test
    public void shouldNotAuthenticateInvalidUser() {
        new UserCredential();
        String userId = "123-1234";
        Password password = new Password("1235");

        UserAuthentication userAuthentication = new UserAuthentication();
        assertFalse(userAuthentication.authenticate(userId, password));
    }

    @Test
    public void shouldIdentifyLibrarian() {
        new UserCredential();
        String userId = "456-4567";
        Password password = new Password("4567");

        UserAuthentication userAuthentication = new UserAuthentication();
        userAuthentication.authenticate(userId, password);

        assertTrue(userAuthentication.getCurrentUser() instanceof Librarian);
    }
}
