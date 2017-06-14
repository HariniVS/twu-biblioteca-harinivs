package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.getWELCOME_MESSAGE());
        final List<Book> listOfAvailableBooks = biblioteca.getListOfBooks();

    }
}
