package bankingsystem;


class Transaction implements Runnable {

	private BankAccount account; 
	private String customerName; 
	private int amount; // Withdrawal amount


	public Transaction(BankAccount account, String customerName, int amount) {
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}

	@Override
	public void run() {



		System.out.println("Thread State before run: " + Thread.currentThread().getState());



		account.withdraw(customerName, amount);
	}
}