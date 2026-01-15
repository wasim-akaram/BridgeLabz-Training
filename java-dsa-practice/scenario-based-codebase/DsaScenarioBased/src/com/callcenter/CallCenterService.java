package com.callcenter;

public class CallCenterService
{
    private NormalCallQueue normalQueue = new NormalCallQueue();
    private VipCallQueue vipQueue = new VipCallQueue();
    private CallCounter callCounter = new CallCounter();

    // receive incoming call
    public void receiveCall(Customer customer)
    {
        callCounter.recordCall(customer.getCustomerId());

        if (customer.isVip())
        {
            vipQueue.addCustomer(customer);
            System.out.println("VIP customer added: " + customer.getName());
        }
        else
        {
            normalQueue.addCustomer(customer);
            System.out.println("Normal customer added: " + customer.getName());
        }
    }

    // handle next call
    public void handleCall()
    {
        Customer customer;

        if (!vipQueue.isEmpty())
        {
            customer = vipQueue.getNextCustomer();
            System.out.println("Handling VIP customer: " + customer.getName());
        }
        else if (!normalQueue.isEmpty())
        {
            customer = normalQueue.getNextCustomer();
            System.out.println("Handling normal customer: " + customer.getName());
        }
        else
        {
            System.out.println("No calls in queue");
        }
    }

    public void showCallReport()
    {
        callCounter.displayCallCount();
    }
}
