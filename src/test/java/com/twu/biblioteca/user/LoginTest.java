package com.twu.biblioteca.user;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.helpers.LoginHelper;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertTrue;

public class LoginTest {

    @Test
    public void shouldReadUserCredential() {

        final StringWriter writer = new StringWriter();
        LoginHelper login = new LoginHelper(new OutputWriter(writer), new InputReaderTestHelper
                ("123-1234\n1234"));
        login.readUserCredential();

        assertTrue(login.isCredentialsRead());
    }
}
