package tourmate;

abstract class Trip implements IBookable{
	private String destination;
	private double budget;
	private int duration; // in days

	public Trip(String destination, double budget, int duration) {
		this.destination = destination;
		this.budget = budget;
		this.duration = duration;

	}

	public Trip(int duration) {
		this.duration = duration;
	}

	public String getDestination() {
		return destination;
	}

	public double getBudget() {
		return budget;
	}

	public int getDuration() {
		return duration;
	}

	public void transportChosen() {
		System.out.println("Get a means of transport to reach the destination");
	}

	public void hotelChosen() {
		System.out.println("Booked a hotel");
	}

	public void activityChosen() {
		System.out.println("Booked an activity to do");
	}

	@Override
	public String book(int persons) {
		if (persons > 0) {
			String str = "Holiday package for " + destination + " booked for " + persons + " person(s)";

			return str;
		} else {
			String str2 = "Invalid argument";
			return str2;

		}
	}

	@Override
	public void cancel(int persons) {
		if (persons > 0) {
			System.out.println("Holiday package for " + destination + "cancelled");
		} else {
			System.out.println("Invalid argument");

		}
	}

}
