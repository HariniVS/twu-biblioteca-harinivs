package com.twu.biblioteca.helpers;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.ReturnItem;

public class ReturnItemHelper extends ReturnItem{

    private InputReaderTestHelper inputReader = new InputReaderTestHelper("The Alchemist");

    public ReturnItemHelper(Repository repository, OutputWriter outputWriter, String itemName) {
        super(repository, outputWriter, itemName);
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
