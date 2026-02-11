package designPattern.librarymanagement;


interface ReservationStrategy {
	void reserve(String user, String book);
}

class LimitedDaysReservation implements ReservationStrategy {
	public void reserve(String user, String book) {
		System.out.println(user + " reserved " + book + " for 7 days.");
	}
}


class ExtendedDaysReservation implements ReservationStrategy {
	public void reserve(String user, String book) {
		System.out.println(user + " reserved " + book + " for 30 days.");
	}
}