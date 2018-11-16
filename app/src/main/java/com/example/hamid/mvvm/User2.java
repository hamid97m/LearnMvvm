package com.example.hamid.mvvm;

public class User2 {
    private final String firstName;
    private final String lastName;
    public User2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}