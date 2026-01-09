package tourmate;

public class InternationalTrip extends Trip {
	public InternationalTrip(String destination, double budget, int duration) {
		super(destination, budget, duration);
	}

	public void transportChosen() {
		System.out.println("Chosen a flight from Qantas Airways");
	}

	public void hotelChosen() {
		System.out.println("Chosen a hotel above 3 star");
	}

	public void activityChosen() {
		System.out.println("Booked surfing");
	}

}
