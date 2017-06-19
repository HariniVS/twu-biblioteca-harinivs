package com.twu.biblioteca.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldGetUserName() {
        String expectedUserName = "User 1";
        User user = new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234");

        assertEquals(expectedUserName, user.getUserName());
    }

    @Test
    public void shouldGetEmailId() {
        String expectedEmailId = "user1@gmail.com";
        User user = new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234");

        assertEquals(expectedEmailId, user.getEmailId());
    }

    @Test
    public void shouldGetAddress() {
        String expectedAddress = "Koramangala";
        User user = new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234");

        assertEquals(expectedAddress, user.getAddress());
    }

    @Test
    public void shouldGetPhoneNumber() {
        int expectedPhoneNumber = 1234;
        User user = new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234");

        assertEquals(expectedPhoneNumber, user.getPhoneNumber());
    }

    @Test
    public void shouldGetUserId() {
        String userId = "123-1234";
        User user = new User("User 1","user1@gmail.com","Koramangala",1234, "123-1234");

        assertEquals(userId, user.getUserId());
    }
}
