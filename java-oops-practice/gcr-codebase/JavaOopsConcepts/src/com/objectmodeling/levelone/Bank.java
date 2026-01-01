package com.objectmodeling.levelone;

import java.util.ArrayList;
import java.util.List;

class Bank 
{
    private String bankName;
    private List<Customer> customers;

    Bank(String bankName) 
    {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    String getBankName() 
    {
        return bankName;
    }

    // Association method
    Account openAccount(Customer customer, int accountNumber) 
    {
        Account account = new Account(accountNumber, this);
        customer.addAccount(account);
        customers.add(customer);
        return account;
    }
}
