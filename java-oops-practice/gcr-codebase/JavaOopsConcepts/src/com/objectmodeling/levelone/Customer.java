package com.objectmodeling.levelone;

import java.util.ArrayList;
import java.util.List;

class Customer 
{
    private int customerId;
    private String name;
    private List<Account> accounts;

    Customer(int customerId, String name)
    {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account account) 
    {
        accounts.add(account);
    }

    void viewBalance() 
    {
        System.out.println("Customer ID: "+ customerId +"Customer: " + name );
        for (Account acc : accounts) {
            System.out.println(
                "Bank: " + acc.getBank().getBankName() +
                ", Balance: " + acc.getBalance()
            );
        }
    }
}
