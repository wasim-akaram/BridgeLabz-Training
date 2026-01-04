package mybank;



class CurrentAccount extends Account 
{

    private static final double INTEREST_RATE = 1.5; 

    public CurrentAccount(String accNo, double openingBalance) 
    {
        super(accNo, openingBalance);
    }

    public CurrentAccount(String accNo)
    {
        super(accNo);
    }

    @Override
    public double calculateInterest() 
    {
        return getBalance() * INTEREST_RATE / 100;
    }
}
