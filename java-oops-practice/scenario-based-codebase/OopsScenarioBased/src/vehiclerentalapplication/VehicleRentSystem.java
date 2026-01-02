package vehiclerentalapplication;

import java.util.Scanner;
class VehicleRentSystem 
 {
	 public static void main (String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 //Vehicles we have
		 Vehicle bike = new Bike("Yamaha", "Mt-15", 250.0);
		 Vehicle car = new Car("Toyota", "LC 300", 3000.0);
		 Vehicle truck = new Truck("Toyota", "Tundra", 2000.0);
		 
		 //adding one customer
		 Customer customer = new Customer ("Wasim", "DL221067");
		 
		 System.out.println("Welcome "+ customer.getname() + " to Luxury vehicle rental System");
		 System.out.println("Available vehicles:");
		 System.out.println("1. Bike: " + bike.getName() + " " + bike.getModel() + " - $" + bike.totalRent(1) + "/day");
	     System.out.println("2. Car: " + car.getName() + " " + car.getModel() + " - $" + car.totalRent(1) + "/day");
	     System.out.println("3. Truck: " + truck.getName() + " " + truck.getModel() + " - $" + truck.totalRent(1) + "/day");

	        System.out.print("Select a vehicle to rent (1-3): ");
	        int choice = sc.nextInt();
	        System.out.print("Enter number of days to rent: ");
	        int days = sc.nextInt();
	        
	        sc.close();
	        
	        //switchcase for choosing th etype of vehicle
	        Vehicle selectedVehicle;
	        switch (choice) 
	        {
	            case 1:
	                selectedVehicle = bike;
	                break;
	            case 2:
	                selectedVehicle = car;
	                break;
	            case 3:
	                selectedVehicle = truck;
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        double totalRent = selectedVehicle.totalRent(days);
	        System.out.println("Total rent for " + days + " days: $" + totalRent);
	        System.out.println("Thank you for visiting Luxury vehicle rental System ");
		 
		 
		 
	 }

}
