package com.example.model;

import com.example.da.UserAccess;
import com.example.entity.User;

import java.sql.SQLException;

public class LoginBean {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLogin() throws SQLException, ClassNotFoundException {
        return new UserAccess().login(username, password);
    }
}
