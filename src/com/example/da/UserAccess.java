package com.example.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccess {
    private PreparedStatement loginStatement;

    public PreparedStatement getLoginStatement() throws SQLException, ClassNotFoundException {
        if (loginStatement==null){
            Connection connection = new DBConnection().getConnection();

            loginStatement = connection.prepareStatement("select * from user where username = ? and password = ?");
        }
        return loginStatement;
    }

    public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
        PreparedStatement statement = getLoginStatement();
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()){
            return true;
        }
        return false;
    }
}
