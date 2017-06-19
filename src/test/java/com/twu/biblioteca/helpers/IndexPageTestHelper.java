package com.twu.biblioteca.helpers;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.books.BookInventory;

public class IndexPageTestHelper extends IndexPage {

    private boolean isPerformActionCalled;
    private boolean isDisplayWelcomeMessageCalled;
    private boolean isDisplayMenuToUserCalled;
    private final String DEFAULT_EXIT_VALUE = "4";

    @Override
    public String getInputFromUser() {
        return DEFAULT_EXIT_VALUE;
    }

    public IndexPageTestHelper(OutputWriter outputWriter, BookInventory bookInventory) {
        super(outputWriter, bookInventory);
    }

    @Override
    public void displayWelcomeMessage() {
        super.displayWelcomeMessage();
        isDisplayWelcomeMessageCalled = true;
    }

    @Override
    public void displayMenuToUser() {
        super.displayMenuToUser();
        isDisplayMenuToUserCalled = true;
    }

    @Override
    public void performAction(String input) {
        super.performAction(input);
        isPerformActionCalled = true;
    }

    public boolean isPerformActionCalled() {
        return isPerformActionCalled;
    }

    public boolean isDisplayWelcomeMessageCalled() {
        return isDisplayWelcomeMessageCalled;
    }

    public boolean isDisplayMenuToUserCalled() {
        return isDisplayMenuToUserCalled;
    }
}
