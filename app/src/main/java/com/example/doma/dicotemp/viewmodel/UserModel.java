package com.example.doma.dicotemp.viewmodel;

import com.example.doma.dicotemp.model.User;

/**
 * Created by doma on 2018-04-11.
 */

public class UserModel {

    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;

    public UserModel(User user) {
        this.emailHint = user.emailHint;
        this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
