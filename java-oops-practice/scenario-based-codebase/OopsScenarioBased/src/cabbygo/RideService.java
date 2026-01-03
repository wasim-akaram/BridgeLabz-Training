package cabbygo;


public class RideService implements IRideService 
{

    private double fare;        
    private Vehicle currentCar;

    private final double baseFare = 50;

   
    public void bookRide(Vehicle vehicle, double distance) 
    {

        currentCar = vehicle;

        fare = baseFare + (distance * vehicle.getRatePerKm());  

        System.out.println("Your Ride is booked");
        System.out.println("Vehicle Type is  : " + vehicle.getType());
        System.out.println("Vehicle No   : " + vehicle.getVehicleNumber());
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Estimated Fare : ₹" + fare);
    }


    public void endRide()
    {
        System.out.println("Ride ended");
        System.out.println("Final Fare : ₹" + fare);
        currentCar = null;
        fare = 0;
    }
}
