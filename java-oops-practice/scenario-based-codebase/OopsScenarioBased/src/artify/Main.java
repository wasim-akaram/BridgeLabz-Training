package artify;

public class Main 
{
	
	public static void main(String args[])
	{
		//creating two users
		
		User user1 = new User("Wasim", 7000000000.0);
		User user2 = new User("Vipin", 2500000000.0 );
		
		//adding some artworks 
		
		Artwork song = new DigitalArt("hmmhmmhmm", "XYZ", 100000.0, "Monthly");
		Artwork monaLisa = new PrintArt("Mona Lisa", "Leonardo Da Vinci", 100000000.0, "Permament");
		
		song.license(user1);
		System.out.println(user1.getBalance());
		
		
		monaLisa.purchase(user1);
		
		song.license(user2);
		System.out.println(user2.getBalance());
		song.purchase(user2);
		
		
		
	}

}
