package com.twu.biblioteca.helpers;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.CheckoutItem;
import com.twu.biblioteca.user.UserAuthentication;

public class CheckoutItemTestHelper extends CheckoutItem {

    private InputReaderTestHelper inputReader = new InputReaderTestHelper("The Alchemist");

    public CheckoutItemTestHelper(Repository repository, OutputWriter outputWriter, String itemName,
                                  UserAuthentication userAuthentication) {
        super(repository, outputWriter, itemName, userAuthentication);
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
