package com.twu.biblioteca;

import com.twu.biblioteca.menu.LibrarianMenu;
import com.twu.biblioteca.menu.MainMenu;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.menu.UserMenu;
import com.twu.biblioteca.user.Librarian;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserAuthentication;

public class MenuCreator {

    private final Repository repository;
    private final InputReader inputReader;
    private final OutputWriter outputWriter;
    private Menu menu;
    private final UserAuthentication userAuthentication;

    MenuCreator(OutputWriter outputWriter, InputReader inputReader, Repository repository, UserAuthentication userAuthentication) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;
        this.repository = repository;
        this.userAuthentication = userAuthentication;
    }

    public Menu getMenu() {
        customiseMenu();
        return menu;
    }

    private void customiseMenu() {
        User currentUser = userAuthentication.getCurrentUser();
        if (currentUser == null) {
            this.menu = new MainMenu(repository, outputWriter, inputReader, userAuthentication);
            return;
        }
        if (currentUser instanceof Librarian) {
            this.menu = new LibrarianMenu(repository, outputWriter, inputReader, userAuthentication);
            return;
        }
        this.menu = new UserMenu(repository, outputWriter, inputReader, userAuthentication);
    }

}
