package com.twu.biblioteca.user;

class User {

    private final String address;
    private final int phoneNumber;
    private final String userId;
    private String userName;
    private String emailId;

    @Override
    public String toString() {
        return userId;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return user.getUserId().equals(userId);
    }

    User(String userName, String emailId, String address, int phoneNumber, String userId) {
        this.userName = userName;
        this.emailId = emailId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    String getUserName() {
        return userName;
    }

    String getEmailId() {
        return emailId;
    }

    String getAddress() {
        return address;
    }

    int getPhoneNumber() {
        return phoneNumber;
    }

    String getUserId() {
        return userId;
    }

}
