package com.user.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = new Properties();
                FileInputStream fis = new FileInputStream("src/main/resources/config/db_config.properties");
                properties.load(fis);
                String jdbcURL = properties.getProperty("jdbcURL");
                String jdbcUsername = properties.getProperty("jdbcUsername");
                String jdbcPassword = properties.getProperty("jdbcPassword");

                connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
