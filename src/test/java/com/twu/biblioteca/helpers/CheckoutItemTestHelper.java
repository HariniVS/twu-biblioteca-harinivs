package com.twu.biblioteca.helpers;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.CheckoutItem;

public class CheckoutItemTestHelper extends CheckoutItem {

    private InputReaderTestHelper inputReader = new InputReaderTestHelper("The Alchemist");

    public CheckoutItemTestHelper(Repository repository, OutputWriter outputWriter, String itemName) {
        super(repository, outputWriter, itemName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void performAction() {
        super.performAction();
    }

    @Override
    public String getBookNameFromUser() {
        return inputReader.readInput();
    }
}
