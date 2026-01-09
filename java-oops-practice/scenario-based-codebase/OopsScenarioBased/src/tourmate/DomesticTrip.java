package tourmate;

public class DomesticTrip extends Trip {
	public DomesticTrip(String destination, double budget, int duration) {
		super(destination, budget, duration);
	}

	public void transportChosen() {
		System.out.println("Chosen a train to move to the destination");
	}

	public void hotelChosen() {
		System.out.println("Chosen a hotel between 2  - 3 star");
	}

	public void activityChosen() {
		System.out.println("Booked visiting places");
	}
}
