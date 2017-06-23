package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.user.UserAuthentication;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class UserMenuTest {

    private StringWriter writer = new StringWriter();
    private OutputWriter outputWriter = new OutputWriter(writer);
    private InputReader inputReader = new InputReader();
    private Repository repository = new Repository();

    @Test
    public void shouldDisplayMainMenu() {
        UserMenu menu = new UserMenu(repository, outputWriter, inputReader, new UserAuthentication
                ());
        menu.displayMenu();

        String expectedMenu = "1 List Books\n" +
                "2 List Movies\n" +
                "3 Checkout Book\n" +
                "4 Checkout Movie\n" +
                "5 Return Book\n" +
                "6 Return Movie\n" +
                "7 View Profile\n" +
                "8 Logout\n" +
                "9 Quit\n";

        assertEquals(expectedMenu, writer.getBuffer().toString());
    }
}
