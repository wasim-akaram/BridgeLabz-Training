package com.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main 
{

    public static void main(String[] args) 
    {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Wasim", 10000));
        accounts.add(new CurrentAccount("CA202", "Akaram", 20000));

        for (BankAccount account : accounts) {
            
            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);

            // Runtime type checking
            if (account instanceof Loan) 
            {
                Loan loanAccount = (Loan) account;
                System.out.println("Loan Eligible: " + loanAccount.calculateLoanEligibility());
            }
        }
    }
}

