package com.twu.biblioteca.menu;

import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.user.UserAuthentication;
import com.twu.biblioteca.user.UserSession;

public class Logout implements Action {


    private UserAuthentication userAuthentication;

    Logout(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public String toString() {
        return "Logout";
    }

    @Override
    public void performAction() {
        userAuthentication.logout();
    }
}
