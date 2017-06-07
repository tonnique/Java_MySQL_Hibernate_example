package ru.antony.entity;

import  java.io.Serializable;

/**
 * Created by Antony on 07.06.2017.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) {this.userId = userId;}
}


