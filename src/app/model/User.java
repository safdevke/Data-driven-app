package com.app.model;

public class User {

    final String user;
    final String password;
    final String email;

    public User(String user, String password, String email) {
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
