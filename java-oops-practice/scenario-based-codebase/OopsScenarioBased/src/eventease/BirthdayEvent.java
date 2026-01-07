package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                         int attendees, User organizer,
                         double venueCost, double serviceCost) {

        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, 500); // birthday discount
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled for " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
