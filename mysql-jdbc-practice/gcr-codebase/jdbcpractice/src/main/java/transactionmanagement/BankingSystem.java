package transactionmanagement;
import java.sql.*;

public class BankingSystem 
{

    private static final String URL = "jdbc:mysql://localhost:3306/rico";
    private static final String USER = "root";
    private static final String PASSWORD = "Wasim123";

    // Transfer Money with Transaction
    public static void transferMoney(int fromAcc, int toAcc, double amount) 
    {

        Connection con = null;

        try 
        {
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Disable auto-commit for transaction
            con.setAutoCommit(false);

            // Check balance
            PreparedStatement checkBalance = con.prepareStatement(
                    "SELECT balance FROM accounts WHERE account_id = ?");
            checkBalance.setInt(1, fromAcc);
            ResultSet rs = checkBalance.executeQuery();

            if (!rs.next() || rs.getDouble("balance") < amount) 
            {
                throw new RuntimeException("Insufficient Balance!");
            }

            // Deduct from sender
            PreparedStatement debit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            // Credit to receiver
            PreparedStatement credit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            // Insert transaction record
            PreparedStatement insertTxn = con.prepareStatement(
                    "INSERT INTO transactions (from_account, to_account, amount) VALUES (?, ?, ?)");
            insertTxn.setInt(1, fromAcc);
            insertTxn.setInt(2, toAcc);
            insertTxn.setDouble(3, amount);
            insertTxn.executeUpdate();

            // Commit if everything successful
            con.commit();
            System.out.println("Transfer Successful!");

        } 
        catch (Exception e) 
        {
            try 
            {
                if (con != null) 
                {
                    con.rollback(); // Rollback on failure
                    System.out.println("Transaction Failed! Rolled Back.");
                }
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
                    con.setAutoCommit(true);
                if (con != null)
                    con.close();
            }
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }

    //  Check Balance
    public static void checkBalance(int accountId) 
    {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(
                     "SELECT balance FROM accounts WHERE account_id = ?")) 
        {

            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) 
            {
                System.out.println("Balance: " + rs.getDouble("balance"));
            }
            else 
            {
                System.out.println("Account not found.");
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    //  Transaction History
    public static void transactionHistory(int accountId) 
    {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?")) {

            ps.setInt(1, accountId);
            ps.setInt(2, accountId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                System.out.println(
                        "TxnID: " + rs.getInt("txn_id") +
                        " | From: " + rs.getInt("from_account") +
                        " | To: " + rs.getInt("to_account") +
                        " | Amount: " + rs.getDouble("amount") +
                        " | Date: " + rs.getTimestamp("txn_date")
                );
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Main Method
    public static void main(String[] args) 
    {

        transferMoney(1, 2, 500);
        checkBalance(1);
        transactionHistory(1);
    }
}
