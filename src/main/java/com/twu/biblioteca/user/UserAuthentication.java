package com.twu.biblioteca.user;

import java.util.Map;

public class UserAuthentication {

    private UserCredential userCredential = new UserCredential();
    private String librarian = "Librarian";
    private String customer = "Customer";

    public boolean validateUser(String userId, Password password) {
        final Map<User, Password> userCredentials = userCredential.getUserCredentials();
        for (Map.Entry<User, Password> userDetail : userCredentials.entrySet()) {
            if (compareCredentials(userDetail.getKey(), userDetail.getValue(), userId, password))
                return true;
        }
        return false;
    }

    private boolean compareCredentials(User user, Password inputPassword, String userId, Password password) {
        if (user.getUserId().equals(userId) && password.equals(inputPassword)) {
            UserSession.setUserType(customer);
            UserSession.setCurrentUser(user);
            if (user instanceof Librarian) {
                UserSession.setUserType(librarian);
            }
            return true;
        }
        return false;
    }
}
