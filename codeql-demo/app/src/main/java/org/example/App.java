
package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class App {
    public static Connection connection;

    public static void main(String[] args) {
        try {
            String user = args[1];
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM users WHERE username='" + user + "' LIMIT 1;";
            ResultSet results = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.printf("Something went wrong: %s\n", ex.toString());
        }
    }
}
