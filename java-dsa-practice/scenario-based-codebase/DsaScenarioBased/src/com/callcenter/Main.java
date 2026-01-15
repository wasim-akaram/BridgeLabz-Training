package com.callcenter;



public class Main
{
    public static void main(String[] args)
    {
        CallCenterService service = new CallCenterService();

        Customer c1 = new Customer(101, "Alex", false);
        Customer c2 = new Customer(102, "Marty", true);
        Customer c3 = new Customer(103, "Julien", false);
        Customer c4 = new Customer(104, "Skipper", true);

        service.receiveCall(c1);
        service.receiveCall(c2);
        service.receiveCall(c3);
        service.receiveCall(c4);
        service.receiveCall(c2);

        service.handleCall();
        service.handleCall();
        service.handleCall();

        service.showCallReport();
    }
}
