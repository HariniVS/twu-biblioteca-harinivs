package com.twu.biblioteca.menu;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;

public class CheckoutAction implements Action {

    private final OutputWriter outputWriter;
    private final InputReader inputReader;
    private IndexPage indexPage;
    private String bookName;


    public CheckoutAction(OutputWriter outputWriter, InputReader inputReader) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }

    @Override
    public void performAction() {
        indexPage = new IndexPage(outputWriter);
        bookName = getBookNameFromUser();
        if (indexPage.checkoutBook(bookName)) {
            outputWriter.write("Thank you! Enjoy the book.");
        } else {
            outputWriter.write("That book is not available.");
        }
    }

    public String getBookNameFromUser() {
        return inputReader.readInput();
    }
}
