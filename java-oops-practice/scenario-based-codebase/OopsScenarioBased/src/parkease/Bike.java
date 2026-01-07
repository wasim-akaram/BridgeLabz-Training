package parkease;
public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 30);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 6) {
            charge += 50;
        }
        return charge;
    }
}
