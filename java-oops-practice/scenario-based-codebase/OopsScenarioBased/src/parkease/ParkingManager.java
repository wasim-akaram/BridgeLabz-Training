package parkease;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>();

    public boolean assignSlot(ParkingSlot slot, Vehicle vehicle) {

        if (!slot.isAvailable()) {
            return false;
        }

        if (!slot.getVehicleTypeAllowed()
                .equalsIgnoreCase(vehicle.getClass().getSimpleName())) {
            return false;
        }

        slot.occupy();
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                        " parked at slot " + slot.getSlotId());
        return true;
    }

    public void releaseSlot(ParkingSlot slot, Vehicle vehicle, int hours) {
        slot.release();
        double charge = vehicle.calculateCharges(hours);

        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                        " exited. Charge: ₹" + charge);
    }

    // Exposed safely
    public void printLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
