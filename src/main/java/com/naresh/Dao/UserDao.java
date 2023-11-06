package com.naresh.Dao;



import com.naresh.db.Database;
import com.naresh.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private String SELECT_QUERY = "SELECT userid,email,password FROM users WHERE email=? and password=?";
    private String INSERT_QUERY = "insert into users(email,password) values(?,?);";
    Connection connection;

    public UserDao() throws SQLException, ClassNotFoundException {
        connection = Database.getconnection();


    }

    public User loginuser(String email, String password) throws SQLException {
        User user = null;


        PreparedStatement p1 = connection.prepareStatement(SELECT_QUERY);
        p1.setString(1, email);
        p1.setString(2, password);
        ResultSet r1 = p1.executeQuery();
        if (r1.next()) {
            user = new User();
            user.setId(Integer.parseInt(r1.getString("userid")));
            user.setEmail(r1.getString("email"));
            user.setPassword(r1.getString("password"));


        }


        return user;
    }

    public boolean NewUser(String email ,String password ) throws SQLException {

        PreparedStatement p2 = connection.prepareStatement(INSERT_QUERY);
        System.out.println(p2);
        p2.setString(1, email);
        p2.setString(2, password);
        System.out.println(p2);
        p2.executeUpdate();
        System.out.println(p2);



        return true;
    }
}
