package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";

    public String getWELCOME_MESSAGE() {
        return WELCOME_MESSAGE;
    }

    public List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }
}
