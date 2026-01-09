package tourmate;

public class Main 
{
	public static void main (String args[])
	{
		Trip trip1 = new InternationalTrip("Diubai", 25000.0, 4);
		DomesticTrip trip2 = new DomesticTrip("Chennai", 20000.0, 7);
		System.out.println(trip1.book(1));
		trip1.transportChosen();
		trip1.hotelChosen();
		trip1.activityChosen();
		
		System.out.println(trip2.book(3));
		trip2.transportChosen();
		trip2.hotelChosen();
		trip2.activityChosen();
		
	}

}
