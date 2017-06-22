package com.twu.biblioteca.user;

import java.util.Map;

public class UserAuthentication {

    private UserCredential userCredential = new UserCredential();
    private User user;

    public boolean authenticate(String userId, Password password) {
        final Map<User, Password> userCredentials = userCredential.getUserCredentials();
        for (Map.Entry<User, Password> userDetail : userCredentials.entrySet()) {
            if (compareCredentials(userDetail.getKey(), userDetail.getValue(), userId, password)) {
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return user;
    }

    private boolean compareCredentials(User user, Password inputPassword, String userId, Password password) {
        if (user.getUserId().equals(userId) && password.equals(inputPassword)) {
            this.user = user;
            return true;
        }
        return false;
    }

    public void logout() {
        this.user = null;
    }
}
