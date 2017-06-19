package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.UserInterface;

public class CheckoutAction implements Action {

    private UserInterface userInterface;

    @Override
    public String toString() {
        return "Checkout Book";
    }

    @Override
    public void performAction(UserInterface userInterface) {
        this.userInterface = userInterface;
        if (userInterface.checkoutBook(getBookNameFromUser())) {
            userInterface.write("Thank you! Enjoy the book.");
            return;
        }
        userInterface.write("That book is not available.");
    }

    public String getBookNameFromUser() {
        return userInterface.getInputFromUser();
    }
}
