package mybank;

public class Main 
{
	

	    public static void main(String[] args) 
	    {

	        // Polymorphism
	        Account acc1 = new SavingsAccount("SB101", 10000);
	        Account acc2 = new CurrentAccount("CA202");

	        acc2.deposit(20000);

	       
	        System.out.println("\nSavings Account Balance : " + acc1.checkBalance());
	        System.out.println("Savings Interest        : " + acc1.calculateInterest());

	        
	        System.out.println("\nCurrent Account Balance : " + acc2.checkBalance());
	        System.out.println("Current Interest        : " + acc2.calculateInterest());

	        acc1.withdraw(3000);
	        System.out.println("Updated Savings Balance : " + acc1.checkBalance());
	    }
	

}
