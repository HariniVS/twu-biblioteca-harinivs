package com.twu.biblioteca.action;

import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.menu.CheckoutAction;

public class CheckoutActionTestHelper extends CheckoutAction {

    private InputReaderTestHelper inputReader = new InputReaderTestHelper("The Alchemist");

    @Override
    public void performAction(UserInterface userInterface) {
        super.performAction(userInterface);
    }

    @Override
    public String getBookNameFromUser() {
        return inputReader.readInput();
    }
}
