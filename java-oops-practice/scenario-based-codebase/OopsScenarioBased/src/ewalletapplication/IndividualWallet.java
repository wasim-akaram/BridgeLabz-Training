package ewalletapplication;

class IndividualWallet extends Wallet
{
	private static final double DAILY_LIMIT = 100000;
	
	public IndividualWallet()
	{
		super();
	}
	
	public IndividualWallet(double referralBonus)
	{
		super(referralBonus);
	}
	
	public void transfer(User receiver, double amount)
	{
		if(amount > DAILY_LIMIT)
		{
			System.out.println("Transfer amount exceeded daily transfer limit");
			return;
		}
		
		if (debit(amount))
		{
			receiver.getWallet().credit(amount);
			System.out.println("Rs " + amount + "transferred to " + receiver.getName());
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}

	
	
}
