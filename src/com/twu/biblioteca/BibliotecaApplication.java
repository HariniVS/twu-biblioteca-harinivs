package com.twu.biblioteca;

public class BibliotecaApplication {

    private final Biblioteca biblioteca;

    public BibliotecaApplication(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void run() {
        biblioteca.displayWelcomeMessage();
        biblioteca.displayListOfAvailableBooks();
    }
}
