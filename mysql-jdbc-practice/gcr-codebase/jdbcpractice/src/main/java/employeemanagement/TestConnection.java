package employeemanagement;

import java.sql.Connection;

import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {

    	// connecting to the database
        try (Connection conn = DBConnection.getConnection()) {

        	//checking  if the connection is successsful or not?
            if (conn != null) {
                System.out.println("✅ Database Connected Successfully!");
                System.out.println("Database Name: " + conn.getCatalog());
            } else {
                System.out.println("❌ Connection Failed!");
            }

        } catch (SQLException e) {
            System.out.println("❌ Connection Error!");
            e.printStackTrace();
        }
    }
}
