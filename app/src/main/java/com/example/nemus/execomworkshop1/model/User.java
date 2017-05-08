package com.example.nemus.execomworkshop1.model;

/**
 * Created by nemus on 08-May-17.
 */

public class User {

    private String firstName;
    private String lastName;
    private  String iconUrl;

    public User(String firstName, String lastName, String iconUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iconUrl = iconUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                '}';
    }
}
