package com.example.controller;

import com.example.model.ProductBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

@WebServlet(name = "ProductController")
public class ProductController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        ProductBean productBean = new ProductBean();
        productBean.setName(name);
        productBean.setDescription(description);

        try {
            boolean status = productBean.getInsertProduct();

            HttpSession session = request.getSession();

            if (status){
                session.setAttribute("product", productBean);
                response.sendRedirect("success.jsp");
            } else {
                response.sendRedirect("failed.jsp");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
