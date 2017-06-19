package com.twu.biblioteca.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PasswordTest {
    
    @Test
    public void shouldReturnPassword() {
        Password password = new Password("1234");
        assertNotNull(password);
    }

    @Test
    public void assertWhetherTwoPasswordsAreEqual() {
        Password passwordOne = new Password("1234");
        Password passwordTwo = new Password("1234");

        assertEquals(passwordOne, passwordTwo);
    }
}
