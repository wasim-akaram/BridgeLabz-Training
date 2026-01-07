package eventease;



import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected final String eventId; // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected User organizer;

    // Pricing (protected / private)
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {

        this.eventId = UUID.randomUUID().toString();
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with catering / decoration
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {

        this(eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Encapsulated cost calculation (operators used)
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public String getEventId() {
        return eventId;
    }
}
