package bankingsystem;

import java.time.LocalDateTime;


class BankAccount {

	private int balance = 10000; // Initial balance

	
	public boolean withdraw(String customer, int amount) {

		
		System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount + " at "
				+ LocalDateTime.now());



		if (balance >= amount) {

			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance -= amount;
			System.out.println("Transaction successful: " + customer + ", Amount: " + amount + ", Balance: " + balance);
			return true;

		} else {
			System.out.println("Transaction failed: " + customer + ", Insufficient balance");
			return false;
		}
	}

	// Getter for balance
	public int getBalance() {
		return balance;
	}
}