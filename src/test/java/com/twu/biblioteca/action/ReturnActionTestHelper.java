package com.twu.biblioteca.action;

import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.menu.ReturnAction;

public class ReturnActionTestHelper extends ReturnAction{

    private InputReaderTestHelper inputReader = new InputReaderTestHelper("The Alchemist");

    @Override
    public String getBookNameFromUser() {
        return inputReader.readInput();

    }

    @Override
    public void performAction(UserInterface userInterface) {
        super.performAction(userInterface);
    }
}
