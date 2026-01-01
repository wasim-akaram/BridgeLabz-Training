package com.objectmodeling.levelone;

public class MainOfBank 
{
    public static void main(String[] args) 
    {

        Bank sbi = new Bank("Axis Bank");
        Bank hdfc = new Bank("Bank of Baroda");

        Customer c1 = new Customer(1, "Wasim");
        Customer c2 = new Customer(2, "Alex");

        Account a1 = sbi.openAccount(c1, 1001);
        a1.deposit(5000);

        Account a2 = hdfc.openAccount(c1, 2001);
        a2.deposit(12000);

        Account a3 = sbi.openAccount(c2, 1002);
        a3.deposit(3000);

        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
    }
}
