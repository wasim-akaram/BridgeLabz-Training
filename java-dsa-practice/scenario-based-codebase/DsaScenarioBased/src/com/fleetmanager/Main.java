package com.fleetmanager;
public class Main 
{

    public static void main(String[] args) 
    {

        Vehicle[] depotVehicles = {
            new Vehicle("DL-01-A1", 120000),
            new Vehicle("MH-02-B4", 98000),
            new Vehicle("KA-03-C7", 150000),
            new Vehicle("TN-04-D2", 87000),
            new Vehicle("GJ-05-E9", 110000)
        };

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(depotVehicles, 0, depotVehicles.length - 1);

        System.out.println("Master Vehicle Maintenance Schedule:");
        for (Vehicle v : depotVehicles) 
        {
            System.out.println(v.vehicleId + " → " + v.mileage + " km");
        }
    }
}
