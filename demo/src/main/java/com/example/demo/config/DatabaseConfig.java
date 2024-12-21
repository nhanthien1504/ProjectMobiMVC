package com.example.demo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/QLBH_DEF";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password"; // Thay đổi với mật khẩu của bạn

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Could not connect to the database", e);
        }
    }
}
