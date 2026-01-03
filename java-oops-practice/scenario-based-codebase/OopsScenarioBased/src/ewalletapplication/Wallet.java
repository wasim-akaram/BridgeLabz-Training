package ewalletapplication;


import java.util.ArrayList;

abstract class Wallet implements Transferrable
{
	private double balance;
	protected ArrayList <Transaction> history = new ArrayList<>();
	
	//constructor
	public Wallet()
	{
		this.balance =0;
	}
	
	//constructor
	public Wallet (double referralBonus)
	{
		this.balance = referralBonus;
		history.add(new Transaction("Referral Bonus ", referralBonus));
	}
	
	//getter
	public double getBalance()
	{
		return balance;
	}
	
	//method for credit
	protected void credit(double amount)
	{
		balance += amount;
		history.add(new Transaction("Credit ", amount));
	}
	
	//method for debit
	protected boolean debit(double amount)
	{
		if(balance >= amount )
		{
			balance -= amount;
		
			history.add(new Transaction("Debit ", amount));
			return true;
		}
		return false;
	}
	
	//method to view transaction
	public void showTransaction()
	{
		for (Transaction t : history)
		{
			System.out.println(t);
		}
	}
	

}
