package com.twu.biblioteca.user;

public class User {

    private final String address;
    private final int phoneNumber;
    private String userName;
    private String emailId;

    User(String userName, String emailId, String address, int phoneNumber) {
        this.userName = userName;
        this.emailId = emailId;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    String getUserName() {
        return userName;
    }

    String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
