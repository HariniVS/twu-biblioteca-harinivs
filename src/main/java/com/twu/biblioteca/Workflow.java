package com.twu.biblioteca;

class Workflow {

    private final UserInterface userInterface;

    Workflow(UserInterface userInterface) {
        this.userInterface = userInterface;
        userInterface.displayWelcomeMessage();
    }

    void start() {
        String inputFromUser;

        try {
            do {
                userInterface.displayMenu();
                inputFromUser = userInterface.getInputFromUser();
                userInterface.performAction(inputFromUser);
            } while (true);
        } catch (QuitProgramException exception) {
        }
    }

}
