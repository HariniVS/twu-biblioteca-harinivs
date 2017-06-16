package com.twu.biblioteca.menu;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;

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
        IndexPage indexPage = new IndexPage(outputWriter);
        indexPage.displayListOfAvailableBooks();
    }
}
