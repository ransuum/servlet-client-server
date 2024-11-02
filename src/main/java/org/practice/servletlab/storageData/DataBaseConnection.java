package org.practice.servletlab.storageData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnection {
    private Properties properties;
    private String url;

    public DataBaseConnection() {
        this.properties = new Properties();
        this.properties.put("user", "postgres");
        this.properties.put("password", "82232");
        this.url = "jdbc:postgresql://localhost/postgres";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL JDBC Driver not found", e);
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}
