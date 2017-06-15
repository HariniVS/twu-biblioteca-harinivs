package com.twu.biblioteca;

public class BibliotecaApplication {

    private final Biblioteca biblioteca;

    public BibliotecaApplication(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void run() {
        System.out.println(biblioteca.getWELCOME_MESSAGE());
        biblioteca.displayListOfAvailableBooks();
    }
}
