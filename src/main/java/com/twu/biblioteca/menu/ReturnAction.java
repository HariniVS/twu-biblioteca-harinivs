package com.twu.biblioteca.menu;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;

public class ReturnAction implements Action {
    private final OutputWriter outputWriter;
    private final InputReader inputReader;

    public ReturnAction(OutputWriter outputWriter, InputReader inputReader) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;
    }

    @Override
    public String toString() {
        return "Return Book";
    }

    @Override
    public void performAction() {
        IndexPage indexPage = new IndexPage(outputWriter);
        String bookName = getBookNameFromUser();
        if (indexPage.returnBook(bookName)) {
            outputWriter.write("Thank you for returning the book.");
        } else {
            outputWriter.write("That is not a valid book to return.");
        }
    }

    private String getBookNameFromUser() {
        return inputReader.readInput();
    }
}
