package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                           int attendees, User organizer,
                           double venueCost, double serviceCost) {

        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, 0); // no discount
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled. Notifying all attendees.");
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled. Refund process initiated.");
    }
}
