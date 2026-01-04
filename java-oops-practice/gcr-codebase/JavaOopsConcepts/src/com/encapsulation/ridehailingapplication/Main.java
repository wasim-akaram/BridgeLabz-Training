package com.encapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class Main 
{

    public static void main(String[] args) 
    {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR5734", "Alex", 15));
        vehicles.add(new Bike("BIKE202", "Julien", 10));
        vehicles.add(new Auto("AUTO303", "Mort", 12));

        double distance = 10; // km

        for (Vehicle vehicle : vehicles)
        {
            
            vehicle.getVehicleDetails();
            vehicle.updateLocation("Anand Nagar");

            System.out.println("Current Location: " + vehicle.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        }
    }
}
