package com.twu.biblioteca;

import com.twu.biblioteca.user.UserSession;

import java.util.LinkedHashMap;
import java.util.Map;

class Workflow {

    private final UserInterface userInterface;
    private Map<String, String> quit = new LinkedHashMap<>();


    Workflow(UserInterface userInterface) {
        this.userInterface = userInterface;
        quit.put("General", "4");
        quit.put("Customer", "9");
        quit.put("Librarian", "4");
        userInterface.displayWelcomeMessage();
    }

    void start() {
        String inputFromUser;
        do {
            userInterface.displayMenu(getUserType());
            inputFromUser = userInterface.getInputFromUser();
            userInterface.performAction(inputFromUser, getUserType());
        } while (!inputFromUser.equals(getQuitValue()));
    }

    private String getQuitValue() {
        return quit.get(getUserType());
    }

    private String getUserType() {
        return UserSession.getUserType();
    }
}
