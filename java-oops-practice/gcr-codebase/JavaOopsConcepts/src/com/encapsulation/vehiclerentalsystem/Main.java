package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) 
    {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-98765"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-54321"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-INS-11122"));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) 
        {
            
            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = vehicle.calculateInsurance(rentalDays);

            System.out.println("Rental Cost    : " + rentalCost);
            System.out.println("Insurance Cost : " + insuranceCost);
            System.out.println(vehicle.getInsuranceDetails());
        }
    }
}
