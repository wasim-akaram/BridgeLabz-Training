package designPattern.librarymanagement;


class Student implements User {

	private String name; 
	private ReservationStrategy strategy = new LimitedDaysReservation(); 

	public Student(String name) {
		this.name = name;
	}

	public void showRole() {
		System.out.println(name + " is a Student.");
	}

	public void reserveBook(String bookName) {
		strategy.reserve(name, bookName);
	}

	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}