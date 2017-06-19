package com.twu.biblioteca.user;

import java.util.LinkedHashMap;
import java.util.Map;

class UserAuthentication {

    private final String userId;
    private final Password password;

    private UserCredential userCredential = new UserCredential();

    UserAuthentication(String userId, Password password) {
        this.userId = userId;
        this.password = password;
    }

     boolean validateUser() {
        final LinkedHashMap<User, Password> userCredentials = userCredential.getUserCredentials();
         for (Map.Entry<User, Password> userDetail : userCredentials.entrySet() ) {
             final User user = userDetail.getKey();
             final Password password = userDetail.getValue();
             if (user.getUserId().equals(userId) && password.equals(this.password)) {
                 return true;
             }
         }
         return false;
     }
}
