package employeemanagement;

import java.sql.*;


import java.util.Scanner;

public class EmployeeManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by Name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: updateSalary(); break;
                case 4: deleteEmployee(); break;
                case 5: searchEmployee(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    //  Add Employee
    static void addEmployee() {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter department: ");
        String dept = sc.next();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        String sql = "INSERT INTO employee (name, department, salary) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setInt(3, salary);

            ps.executeUpdate();
            System.out.println("Employee Added Successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  View All Employees
    static void viewEmployees() {

        String sql = "SELECT * FROM employee";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getInt("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  Update Salary
    static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter new salary: ");
        int salary = sc.nextInt();

        String sql = "UPDATE employee SET salary=? WHERE emp_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Salary Updated Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    static void deleteEmployee() {

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM employee WHERE emp_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  Search Employee by Name
    static void searchEmployee() {

        System.out.print("Enter employee name: ");
        String name = sc.next();

        String sql = "SELECT * FROM employee WHERE name=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getInt("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
