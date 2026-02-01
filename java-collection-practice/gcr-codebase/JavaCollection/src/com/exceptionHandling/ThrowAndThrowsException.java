package com.exceptionHandling;

public class ThrowAndThrowsException 
{
	double amount;
	double rate;
	int years;
	public ThrowAndThrowsException()
	{
		this.amount = amount;
		this.rate= rate;
		this.years=years;
	}
	 public void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException
	 {
		 if(amount <0 || rate<0)
		 {
			 throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		 }
		 System.out.println("Total money is " + amount * rate * years);
	 }
	 
	 public static void main(String args[])
	 {
		 ThrowAndThrowsException obj = new ThrowAndThrowsException();
		 
		 try
		 {
			 obj.calculateInterest(10000, -10, 5);
		 }
		 catch(IllegalArgumentException ec)
		 { 
			 System.out.println(ec.getMessage());
		 }
	 }

}
