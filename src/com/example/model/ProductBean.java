package com.example.model;

import com.example.da.ProductAccess;

import java.sql.SQLException;

public class ProductBean {
    private String name, description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getInsertProduct() throws SQLException, ClassNotFoundException {
       return new ProductAccess().getInsertProduct(name, description);
    }
}
