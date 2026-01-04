package mybank;




class SavingsAccount extends Account 
{

    private static final double INTEREST_RATE = 4.0; 

    public SavingsAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    public SavingsAccount(String accNo) {
        super(accNo);
    }

    @Override
    public double calculateInterest() {
        // operator usage: balance * interestRate / 100
        return getBalance() * INTEREST_RATE / 100;
    }
}
