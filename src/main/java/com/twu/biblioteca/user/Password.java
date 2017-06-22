package com.twu.biblioteca.user;

public class Password {

    private final String password;

    @Override
    public String toString() {
        return password;
    }

    @Override
    public boolean equals(Object object) {
        Password passwordObject = (Password) object;
        return passwordObject.password.equals(password);
    }

    public Password(String password) {
        this.password = password;
    }
}
