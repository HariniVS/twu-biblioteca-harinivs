package com.twu.biblioteca.helpers;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;

public class IndexPageTestHelper extends IndexPage {

    private boolean isPerformActionCalled;

    public IndexPageTestHelper(OutputWriter outputWriter) {
        super(outputWriter);
    }

    @Override
    public void performAction(int inputFromUser) {
        super.performAction(inputFromUser);
        isPerformActionCalled = true;
    }

    public boolean isPerformActionCalled() {
        return isPerformActionCalled;
    }
}
