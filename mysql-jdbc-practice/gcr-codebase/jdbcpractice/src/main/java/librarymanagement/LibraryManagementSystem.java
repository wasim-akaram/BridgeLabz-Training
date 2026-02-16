package librarymanagement;
import java.sql.*;

import java.util.Scanner;

public class LibraryManagementSystem 
{

    static final String URL = "jdbc:mysql://localhost:3306/rico";
    static final String USER = "root";
    static final String PASSWORD = "Wasim123";

    // Get Connection
    public static Connection getConnection() throws Exception 
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add Book
    public static void addBook(double isbn, String name, int stock) 
    {
        String sql = "INSERT INTO book (ISBN, name, stock) VALUES (?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, isbn);
            ps.setString(2, name);
            ps.setInt(3, stock);
            ps.executeUpdate();

            System.out.println("Book added successfully.");

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Add Student
    public static void addStudent(int id, String name, String contact) 
    {
        String sql = "INSERT INTO student (stu_id, name, contact, books_borrowed) VALUES (?, ?, ?, 0)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) 
        {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, contact);
            ps.executeUpdate();

            System.out.println("Student added successfully.");

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Borrow Book (Transaction)
    public static void borrowBook(int stuId, double isbn) 
    {

        Connection con = null;

        try 
        {
            con = getConnection();
            con.setAutoCommit(false);

            PreparedStatement check = con.prepareStatement(
                    "SELECT name, stock FROM book WHERE ISBN = ?");
            check.setDouble(1, isbn);
            ResultSet rs = check.executeQuery();

            if (!rs.next() || rs.getInt("stock") <= 0)
                throw new RuntimeException("Book not available.");

            String bookName = rs.getString("name");

            PreparedStatement reduce = con.prepareStatement(
                    "UPDATE book SET stock = stock - 1 WHERE ISBN = ?");
            reduce.setDouble(1, isbn);
            reduce.executeUpdate();

            PreparedStatement updateStudent = con.prepareStatement(
                    "UPDATE student SET books_borrowed = books_borrowed + 1 WHERE stu_id = ?");
            updateStudent.setInt(1, stuId);
            updateStudent.executeUpdate();

            PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO borrow_history (stu_id, book_name, ISBN) VALUES (?, ?, ?)");
            insert.setInt(1, stuId);
            insert.setString(2, bookName);
            insert.setDouble(3, isbn);
            insert.executeUpdate();

            con.commit();
            System.out.println("Book borrowed successfully.");

        }
        catch (Exception e) 
        {
            try 
            {
                if (con != null) con.rollback();
                System.out.println("Transaction rolled back.");
            }
            catch (SQLException ex) 
            {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (con != null) 
                {
                    con.setAutoCommit(true);
                    con.close();
                }
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }

    // Return Book
    public static void returnBook(int borrowId) 
    {

        Connection con = null;

        try 
        {
            con = getConnection();
            con.setAutoCommit(false);

            PreparedStatement getRecord = con.prepareStatement(
                    "SELECT stu_id, ISBN FROM borrow_history WHERE borrow_id = ?");
            getRecord.setInt(1, borrowId);
            ResultSet rs = getRecord.executeQuery();

            if (!rs.next())
                throw new RuntimeException("Invalid borrow ID");

            int stuId = rs.getInt("stu_id");
            double isbn = rs.getDouble("ISBN");

            PreparedStatement increase = con.prepareStatement(
                    "UPDATE book SET stock = stock + 1 WHERE ISBN = ?");
            increase.setDouble(1, isbn);
            increase.executeUpdate();

            PreparedStatement updateStudent = con.prepareStatement(
                    "UPDATE student SET books_borrowed = books_borrowed - 1 WHERE stu_id = ?");
            updateStudent.setInt(1, stuId);
            updateStudent.executeUpdate();

            PreparedStatement updateReturn = con.prepareStatement(
                    "UPDATE borrow_history SET return_date = NOW() WHERE borrow_id = ?");
            updateReturn.setInt(1, borrowId);
            updateReturn.executeUpdate();

            con.commit();
            System.out.println("Book returned successfully.");

        }
        catch (Exception e) 
        {
            try 
            {
                if (con != null) con.rollback();
            }
            catch (SQLException ex) 
            {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (con != null) 
                {
                    con.setAutoCommit(true);
                    con.close();
                }
            }
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }

    // View Borrow History
    public static void viewBorrowHistory(int stuId) 
    {
        String sql = "SELECT * FROM borrow_history WHERE stu_id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) 
        {

            ps.setInt(1, stuId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                System.out.println(
                        "Borrow ID: " + rs.getInt("borrow_id") +
                        " | Book: " + rs.getString("book_name") +
                        " | Borrow Date: " + rs.getTimestamp("date") +
                        " | Return Date: " + rs.getTimestamp("return_date")
                );
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Search Book
    public static void searchBook(String keyword) 
    {
        String sql = "SELECT * FROM book WHERE name LIKE ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) 
        {

            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                System.out.println(
                        "ISBN: " + rs.getDouble("ISBN") +
                        " | Name: " + rs.getString("name") +
                        " | Stock: " + rs.getInt("stock")
                );
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // MAIN METHOD (Menu)
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        while (true) 
        {

            System.out.println("\n1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Borrow History");
            System.out.println("6. Search Book");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.print("ISBN: ");
                    double isbn = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    addBook(isbn, name, stock);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String stuName = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    addStudent(id, stuName, contact);
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int stuId = sc.nextInt();
                    System.out.print("ISBN: ");
                    double bookIsbn = sc.nextDouble();
                    borrowBook(stuId, bookIsbn);
                    break;

                case 4:
                    System.out.print("Borrow ID: ");
                    int borrowId = sc.nextInt();
                    returnBook(borrowId);
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    int historyId = sc.nextInt();
                    viewBorrowHistory(historyId);
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    searchBook(keyword);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}