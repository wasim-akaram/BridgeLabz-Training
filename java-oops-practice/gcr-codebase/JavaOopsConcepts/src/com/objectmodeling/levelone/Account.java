package com.objectmodeling.levelone;

class Account 
{
    private int accountNumber;
    private double balance;
    private Bank bank;   // Association with Bank

    Account(int accountNumber, Bank bank)
    {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    void deposit(double amount) 
    {
        balance += amount;
    }

    double getBalance() 
    {
        return balance;
    }

    Bank getBank() 
    {
        return bank;
    }
}
