package eventease;

public class Main{

    public static void main(String[] args) 
    {

        User organizer = new User(
                "Wasim",
                "wasim@email.com",
                "9876543210"
        );

        Event event1 = new BirthdayEvent(
                "Akaram's Birthday",
                "Banquet Hall",
                "12-05-2026",
                100,
                organizer,
                30000,
                10000
        );

        Event event2 = new ConferenceEvent(
                "Tech Summit",
                "Convention Center",
                "20-06-2026",
                500,
                organizer,
                100000,
                40000
        );

        // Polymorphism
        event1.schedule();
        event2.schedule();

        System.out.println("Event1 Cost: " + event1.calculateTotalCost());
        System.out.println("Event2 Cost: " + event2.calculateTotalCost());
    }
}
