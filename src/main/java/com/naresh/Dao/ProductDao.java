package com.naresh.Dao;

import com.naresh.db.Database;
import com.naresh.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDao {
    private static String SELECT_QUERY = "SELECT * FROM product ";
    static Connection connection;


    public ProductDao() throws SQLException, ClassNotFoundException {
        connection = Database.getconnection();
    }

    public static List<Product> getproducts() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);
        ResultSet set = preparedStatement.executeQuery();
        List<Product> product = new ArrayList<>();
        while (set.next()) {
            Product prod = new Product();
            prod.setId(set.getInt("productid"));
            prod.setTitle(set.getString("product_name"));
            prod.setPrice(set.getInt("price"));
            product.add(prod);
        }

        return product;
    }
}