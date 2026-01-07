package parkease;
public class ParkingSlot {

    private final String slotId;
    private final String location;
    private final String vehicleTypeAllowed;

    private boolean isOccupied;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    // Internal-only state changes
    protected void occupy() {
        isOccupied = true;
    }

    protected void release() {
        isOccupied = false;
    }

    public String getSlotId() {
        return slotId;
    }
}
