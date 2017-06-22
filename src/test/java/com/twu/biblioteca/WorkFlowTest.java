package com.twu.biblioteca;

import com.twu.biblioteca.helpers.UserInterfaceTestHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.OutputStreamWriter;

import static org.junit.Assert.assertTrue;

public class WorkFlowTest {

    private Workflow workflow;
    private UserInterfaceTestHelper userInterfaceTestHelper;


    @Before
    public void setUp() {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        InputReader inputReader = new InputReader();
        Repository repository = new Repository();

        userInterfaceTestHelper = new UserInterfaceTestHelper(outputWriter, inputReader, repository);
        workflow = new Workflow(userInterfaceTestHelper);
    }

    @Test
    public void shouldUseIndexPageToDisplayWelcomeMessage() {
        workflow.start();
        assertTrue(userInterfaceTestHelper.isDisplayWelcomeMessageCalled());
    }

    @Test
    public void shouldUseDisplayMenuToUser() {
        workflow.start();
        assertTrue(userInterfaceTestHelper.isDisplayMenuToUserCalled());
    }

}
