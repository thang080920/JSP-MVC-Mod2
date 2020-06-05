package com.example.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAccess {
    private PreparedStatement insertStatement;

    public PreparedStatement getInsertStatement() throws SQLException, ClassNotFoundException {
        if (insertStatement==null){
            Connection connection = new DBConnection().getConnection();
            insertStatement = connection.prepareStatement("insert into product(name , description) values (?,?)");
        }
        return insertStatement;
    }

    public boolean getInsertProduct(String name, String description) throws SQLException, ClassNotFoundException {
        PreparedStatement statement = getInsertStatement();
        statement.setString(1, name);
        statement.setString(2, description);
        int resultSet = statement.executeUpdate();

        if (resultSet == 1){
            System.out.println("Create Success");
            return true;
        }
        else {
            System.out.println("Failed");
            return false;
        }
    }
}
