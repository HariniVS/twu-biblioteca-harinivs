package com.twu.biblioteca.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;

import java.util.List;

public class ListAction implements Action {

    private final OutputWriter outputWriter;

    public ListAction(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override

    public String toString() {
        return "List Books";
    }

    @Override
    public void performAction() {
        List<Book> books = new IndexPage(outputWriter).getAvailableBooks();
        for ( Book book: books) {
            outputWriter.write(book.toString());
        }
    }
}
