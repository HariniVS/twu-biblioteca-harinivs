package com.twu.biblioteca.user;

public class UserSession {

    private static User currentUser = null;
    private static String userType = "General";

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        UserSession.currentUser = currentUser;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserSession.userType = userType;
    }
}
