package mybank;



abstract class Account implements Transaction 
{

    protected String accountNumber;  
    private double balance;            

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) 
    {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Constructor without opening balance
    public Account(String accountNumber) 
    {
        this(accountNumber, 0.0);
    }

    // Deposit
    @Override
    public void deposit(double amount) 
    {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid or insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Check balance
    @Override
    public double checkBalance() {
        return balance;
    }

    // Protected access for subclasses
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    
    public abstract double calculateInterest();
}
