package cabbygo;

public class Main
{

    public static void main(String[] args) 
    {

    	
        Driver driver = new Driver("Han Lui", "DL12345", 4.6);

        Vehicle miniCar = new Mini("MP04AX7867");
        Vehicle suv = new SUV("MP04SB9876");

        RideService ride = new RideService();

        System.out.println("Driver Name : " + driver.getName());
        System.out.println("Driver Rating : " + driver.getRating());

        ride.bookRide(miniCar, 8.5);
        ride.endRide();

        System.out.println();

        ride.bookRide(suv, 12);
        ride.endRide();
    }
}
