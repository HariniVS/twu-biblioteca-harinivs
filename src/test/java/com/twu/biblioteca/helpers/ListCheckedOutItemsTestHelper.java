package com.twu.biblioteca.helpers;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.ListCheckedOutItems;

public class ListCheckedOutItemsTestHelper extends ListCheckedOutItems {

    private boolean isPerformActionCalled;

    public ListCheckedOutItemsTestHelper(Repository repository, OutputWriter outputWriter, String itemName) {
        super(repository, outputWriter, itemName);
    }

    @Override
    public void performAction() {
        super.performAction();
        isPerformActionCalled = true;
    }

    public boolean isPerformActionCalled() {
        return isPerformActionCalled;
    }
}
