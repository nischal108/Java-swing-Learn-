package LoginSystem;

import java.sql.*;

public class DatabaseConnection {
    final static String DB_URL = "jdbc:mysql://localhost:3306/LoginSystem";
    final static String USER = "root";
    final static String PASSWORD = "";

    public static Connection connect() {

        try {
            // Establish the connection
            Connection c = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connection to the database established successfully.");
            return c;
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database:");
            return null;
        }

    }

//    public static void main(String[] args) {
//        Connection connection = connect();
//        // Remember to close the connection when done
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//
//            }
//        }
//    }
}
