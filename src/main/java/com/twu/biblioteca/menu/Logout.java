package com.twu.biblioteca.menu;

import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.user.UserSession;

public class Logout implements Action {

    @Override
    public String toString() {
        return "Logout";
    }

    @Override
    public void performAction() {
        UserSession.setUserType("General");
        UserSession.setCurrentUser(null);
    }
}
