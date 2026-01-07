package parkease;
public class Main {

    public static void main(String[] args) {

        ParkingSlot slot1 =
                new ParkingSlot("S1", "Zone-A", "Car");

        Vehicle car = new Car("KA-01-1234");

        ParkingManager manager = new ParkingManager();

        if (manager.assignSlot(slot1, car)) {
            System.out.println("Slot assigned successfully.");
        }

        manager.releaseSlot(slot1, car, 6); // 6 hours parking

        manager.printLogs();
    }
}
