package program.oop_classes_objects;

public class BankAccount {
	/*
	 * Encapsulation — Bank Account : Design BankAccount with a private double
	 * balance, plus deposit() and withdraw() that validate input.
	 * 
	 * EXAMPLE acc.deposit(50); // ok acc.withdraw(200); // throws if insufficient
	 * funds CONSTRAINTS & NOTES No public setter for balance — it can only change
	 * via deposit/withdraw.
	 */
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successfully completed");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successfully completed");
		} else {
			throw new IllegalArgumentException("Insufficient funds: Withdrawal failed");
		}
	}

	public static void main(String[] args) {
		BankAccount acc= new BankAccount(50.2);
		acc.deposit(50);   // ok
		acc.withdraw(200); // throws if insufficient funds
	}

}
