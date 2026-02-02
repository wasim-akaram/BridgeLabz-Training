package com.exceptionHandling.BankTransactionSystem;
// Custom Exception
class InsufficientBalanceException extends Exception
{

    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}
