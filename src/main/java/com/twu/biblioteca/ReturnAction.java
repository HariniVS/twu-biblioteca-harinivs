package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;

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

    public String getBookNameFromUser() {
        return inputReader.readInput();
    }
}
