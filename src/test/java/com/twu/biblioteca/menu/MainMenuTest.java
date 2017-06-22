package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.user.UserAuthentication;
import org.junit.Test;

import java.io.OutputStreamWriter;

public class MainMenuTest {

    private OutputStreamWriter writer;

    {
        writer = new OutputStreamWriter(System.out);
    }

    private OutputWriter outputWriter = new OutputWriter(writer);
    private InputReader inputReader = new InputReader();
    private Repository repository = new Repository();

    @Test
    public void shouldReturnMenu() {
        MainMenu menu = new MainMenu(repository, outputWriter, inputReader, new UserAuthentication());
    }


    @Test
    public void shouldDisplayMainMenu() {

    }
}
