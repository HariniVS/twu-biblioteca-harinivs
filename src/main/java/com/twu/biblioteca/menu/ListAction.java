package com.twu.biblioteca.menu;

import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.books.Book;

import java.util.List;

public class ListAction implements Action {

    @Override
    public String toString() {
        return "List Books";
    }

    @Override
    public void performAction(UserInterface userInterface) {
        List<Book> books = userInterface.getAvailableBooks();
        for (Book book : books) {
            userInterface.write(book.toString());
        }
    }
}
