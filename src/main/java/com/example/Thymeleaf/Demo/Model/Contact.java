package com.example.Thymeleaf.Demo.Model;

public class Contact {

    private String name;
    private String email;

    public Contact() {
        // empty constructor (required)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
