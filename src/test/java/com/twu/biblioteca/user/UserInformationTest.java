package com.twu.biblioteca.user;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.menu.UserInformation;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class UserInformationTest {

    @Test
    public void shouldDisplayMenu() {
        UserInformation userInformation = new UserInformation(new OutputWriter(new StringWriter()),
                new UserAuthentication());

        assertEquals("View Profile",userInformation.toString());
    }

    @Test
    public void shouldPerformAction() {
        final StringWriter writer = new StringWriter();
        final UserAuthentication userAuthentication = new UserAuthentication();
        UserInformation userInformation = new UserInformation(new OutputWriter(writer),
                userAuthentication);
        userAuthentication.authenticate("123-1234", new Password("1234"));
        userInformation.performAction();

        assertEquals("123-1234 User 1 user1@gmail.com Koramangala 1234\n", writer.getBuffer()
                .toString());
    }
}
