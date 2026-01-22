package birdsanctuary;

public class Main {
	 public static void main(String[] args) {

	        Birds[] birds = {
	            new Eagle(101, "Rocky"),
	            new Ducks(102, "Daisy"),
	            new Seagull(103, "Sky"),
	            new Ostrich(104, "Kibo")
	        };

	        for (Birds bird : birds) {
	            bird.displayInfo();
	            bird.eat();

	            if (bird instanceof IFlyable) {
	                ((IFlyable) bird).fly();
	            }

	            if (bird instanceof ISwimmable) {
	                ((ISwimmable) bird).swim();
	            }

	            System.out.println("--------------------");
	        }
	 }
}