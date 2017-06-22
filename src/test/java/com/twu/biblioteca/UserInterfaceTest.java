package com.twu.biblioteca;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserInterfaceTest {

    private OutputWriter outputWriter;
    private StringWriter stringWriter;
    private UserInterface userInterface;
    private String userType = "General";

    @Test
    public void shouldDisplayMenu() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        InputReader inputReader = new InputReader();
        Repository repository = new Repository();
        userInterface = new UserInterface(outputWriter, inputReader, repository);
        userInterface.displayMenu(userType);
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        String expectedMenu =
                "1 List Books\n" +
                "2 List Movies\n"+
                "3 Login\n"+
                "4 Quit\n";
        assertEquals(expectedMenu, stringBuffer.toString());
    }

    @Test
    public void shouldPerformActionBasedOnUserInput() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
//        userInterface = new UserInterface(outputWriter, bookInventory);

//        UserInterfaceTestHelper helper = new UserInterfaceTestHelper(outputWriter, inputReader,
//                repository);
//        helper.performAction("1");

//        assertTrue(helper.isPerformActionCalled());
    }
}


