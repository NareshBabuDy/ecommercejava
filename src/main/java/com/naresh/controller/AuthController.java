package com.naresh.controller;

import com.naresh.Dao.ProductDao;
import com.naresh.Dao.UserDao;
import com.naresh.model.Product;
import com.naresh.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class AuthController extends HttpServlet {

    private final UserDao userDao;
private final ProductDao productDao;
    public AuthController() throws SQLException, ClassNotFoundException {

        this.userDao = new UserDao();
        this.productDao=new ProductDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            User LoggedInUser = this.userDao.loginuser(email, password);
            if (LoggedInUser != null) {
                HttpSession session = req.getSession();
                session.setAttribute("id", User.getId());
                RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
                List<Product> products=productDao.getproducts();
                req.setAttribute("products",products);

                rd.forward(req, resp);
            } else {
                req.setAttribute("error", true);
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.forward(req, resp);
            }

        } catch (SQLException var8) {
            throw new RuntimeException(var8);
        }
    }
}

