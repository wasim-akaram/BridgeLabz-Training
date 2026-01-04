package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loan
{

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) 
    {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount)
    
    {
        System.out.println("Loan applied for amount: " + loanAmount);
    }

    @Override
    public boolean calculateLoanEligibility() 
    {
        return balance >= 5000;
    }
}
