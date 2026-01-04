package com.encapsulation.bankingsystem;

public abstract class BankAccount 
{

    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) 
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete method
    public void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Concrete method
    public void withdraw(double amount) 
    {
        if (amount <= 0 || amount > balance) 
        {
            System.out.println("Invalid or insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Abstract method
    public abstract double calculateInterest();

    // Encapsulated access
    public void displayAccountDetails() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}
