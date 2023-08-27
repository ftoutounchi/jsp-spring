package com.fto.software.login;

public class User {
    private String name;
    private String lname;

    public User(String name, String lname) {
        this.name = name;
        this.lname = lname;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
