package com.example.doma.dicotemp.model;

/**
 * Created by doma on 2018-04-11.
 */

public class User {
    public String email;
    public String password;
    public String emailHint;
    public String passwordHint;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
