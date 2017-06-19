package com.twu.biblioteca;

class Workflow {

    private final UserInterface userInterface;
    private final String QUIT = "4";

    Workflow(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    void start() {

        userInterface.displayWelcomeMessage();

        String inputFromUser;
        do {
            userInterface.displayMenu();
            inputFromUser = userInterface.getInputFromUser();
            userInterface.performAction(inputFromUser);
        } while (!inputFromUser.equals(QUIT));
    }
}
