package com.twu.biblioteca.menu;

import com.twu.biblioteca.UserInterface;

public class ReturnAction implements Action {

    private UserInterface userInterface;

    @Override
    public String toString() {
        return "Return Book";
    }

    @Override
    public void performAction(UserInterface userInterface) {
        this.userInterface = userInterface;
        if (userInterface.returnBook(getBookNameFromUser())) {
            userInterface.write("Thank you for returning the book.");
            return;
        }
        userInterface.write("That is not a valid book to return.");
    }

    public String getBookNameFromUser() {
        return userInterface.getInputFromUser();
    }
}
