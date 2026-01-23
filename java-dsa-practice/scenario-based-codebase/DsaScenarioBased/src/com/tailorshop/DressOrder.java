package com.tailorshop;
import java.time.LocalDate;

class DressOrder 
{
    int orderId;
    LocalDate deadline;

    DressOrder(int orderId, LocalDate deadline) 
    {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    @Override
    public String toString() 
    {
        return "Order " + orderId + "  Deadline: " + deadline;
    }
}
