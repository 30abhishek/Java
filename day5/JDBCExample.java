package com.company.day5;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        statement.executeUpdate("insert into student values(1, 'Sandesh', 'Dewas')");

    }
}
