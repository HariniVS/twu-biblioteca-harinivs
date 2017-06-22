package com.twu.biblioteca.user;

public class User {

    private final String address;
    private final int phoneNumber;

    @Override
    public String toString() {
        return userId+" "+userName+" "+emailId+" "+address+" "+phoneNumber;
    }

    private final String userId;
    private String userName;
    private String emailId;

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return isEqual(user);
    }

    private boolean isEqual(User user) {
        return user.getUserName().equals(userName) && user.getEmailId().equals(emailId) && user
                .getUserId().equals(userId);
    }

    public User(String userName, String emailId, String address, int phoneNumber, String userId) {
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
