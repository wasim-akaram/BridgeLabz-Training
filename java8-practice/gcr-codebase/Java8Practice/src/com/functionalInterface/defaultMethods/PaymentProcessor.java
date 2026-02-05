package com.functionalInterface.defaultMethods;
interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunded amount: " + amount);
    }
}

class UpiPayment implements PaymentProcessor {
    public void pay(double amount) 
    {
        System.out.println("Paid via UPI: " + amount);
    }
}
