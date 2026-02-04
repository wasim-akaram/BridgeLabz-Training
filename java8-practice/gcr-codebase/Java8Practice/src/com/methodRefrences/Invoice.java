package com.methodRefrences;
class Invoice 
{
    private String transactionId;

    // Constructor
    public Invoice(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() 
    {
        return "Invoice created for Transaction ID: " + transactionId;
    }
}
