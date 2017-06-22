package com.twu.biblioteca;

class Workflow {

    private final UserInterface userInterface;

    Workflow(UserInterface userInterface) {
        this.userInterface = userInterface;
        userInterface.displayWelcomeMessage();
    }

    void start() {
        String inputFromUser;
        do {
            userInterface.displayMenu();
            inputFromUser = userInterface.getInputFromUser();
            userInterface.performAction(inputFromUser);
        } while (!inputFromUser.equals("4"));
    }

}
