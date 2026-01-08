package medistore;

import java.time.LocalDate;

public class Main 
{
	public static void main (String args[])
	{
			Tablet tab = new Tablet("Paracetamol", 10.0, LocalDate.of(2026, 5, 03));
			Syrup syrup = new Syrup("Corex", 120.0, LocalDate.of(2026, 7, 15));
			Injection injection = new Injection("Insulin", 150.0, LocalDate.of(2025, 5, 13));
			Tablet tab2 = new Tablet("Dolo 600", 90.0, LocalDate.of(2025, 12, 31));
		
		
		
		//selling
		
		System.out.println("\nSelling Tablets " +tab.getName()+"  "+ tab.sell(10));
		System.out.println("Check if they are expired -- " + tab.checkExpiry());
		System.out.println("\nSelling Tablets " + tab2.getName()+"  "+ tab2.sell(5));
		System.out.println("Check if they are expired -- " + tab.checkExpiry());
		
		System.out.println("\nSelling Injections " +injection.getName()+"  "+ injection.sell(17));
		System.out.println("Check if they are expired -- " + injection.checkExpiry());
		
		System.out.println("\nSelling Syrup " +syrup.getName()+"  "+ syrup.sell(10));
		System.out.println("Check if they are expired -- " + syrup.checkExpiry());


	}
}