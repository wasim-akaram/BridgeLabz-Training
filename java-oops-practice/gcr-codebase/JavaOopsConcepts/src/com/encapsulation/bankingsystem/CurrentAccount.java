package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount 
{

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance)
    {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return balance * INTEREST_RATE;
    }
}
