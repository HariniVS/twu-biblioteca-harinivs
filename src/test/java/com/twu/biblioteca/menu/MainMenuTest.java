package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.user.UserAuthentication;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class MainMenuTest {

    private StringWriter writer = new StringWriter();
    private OutputWriter outputWriter = new OutputWriter(writer);
    private InputReader inputReader = new InputReader();
    private Repository repository = new Repository();

    @Test
    public void shouldDisplayMainMenu() {
        MainMenu menu = new MainMenu(repository, outputWriter, inputReader, new UserAuthentication());
        menu.displayMenu();

        String expectedMenu = "1 List Books\n" +
                "2 List Movies\n" +
                "3 Login\n" +
                "4 Quit\n";
        assertEquals(expectedMenu, writer.getBuffer().toString());
    }
}
