package com.twu.biblioteca.action;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;

public class ReturnItem implements Action {
    private final Repository repository;
    private final OutputWriter outputWriter;
    private final String itemName;

    public ReturnItem(Repository repository, OutputWriter outputWriter, String itemName) {
        this.repository = repository;
        this.outputWriter = outputWriter;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Return " + itemName;
    }

    @Override
    public void performAction() {
        if (repository.returnItem(getBookNameFromUser(), itemName)) {
            outputWriter.write("Thank you for returning the "+itemName);
            return;
        }
        outputWriter.write("That is not a valid "+itemName+" to return.");
    }

    public String getBookNameFromUser() {
        return new InputReader().readInput();
    }
}
