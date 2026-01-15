package com.trafficmanager;

public class VehicleNode
{
    int vehicleId;
    String vehicleNumber;
    VehicleNode next;

    // constructor
    public VehicleNode(int vehicleId, String vehicleNumber)
    {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
