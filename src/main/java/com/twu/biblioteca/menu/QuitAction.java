package com.twu.biblioteca.menu;

import com.twu.biblioteca.UserInterface;

public class QuitAction implements Action {

    @Override
    public String toString() {
        return "Quit";
    }

    @Override
    public void performAction(UserInterface userInterface) {
        userInterface.write("Thank you for using Bangalore Public Library !!");
    }
}
