package com.twu.biblioteca.action;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.user.UserAuthentication;

public class CheckoutItem implements Action {
    private final Repository repository;
    private final OutputWriter outputWriter;
    private final String itemName;
    private UserAuthentication userAuthentication;

    public CheckoutItem(Repository repository, OutputWriter outputWriter, String itemName, UserAuthentication userAuthentication) {
        this.repository = repository;
        this.outputWriter = outputWriter;
        this.itemName = itemName;
        this.userAuthentication = userAuthentication;
    }

    @Override
    public String toString() {
        return "Checkout " + itemName;
    }

    @Override
    public void performAction() {
        if (repository.checkoutItem(getBookNameFromUser(), itemName, userAuthentication.getCurrentUser())) {
            outputWriter.write("Thank you! Enjoy the " + itemName);
            return;
        }
        outputWriter.write("That " + itemName + " is not available.");
    }

    public String getBookNameFromUser() {
        return new InputReader().readInput();
    }

}
