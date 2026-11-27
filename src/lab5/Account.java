package lab5;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	void Deposit(double amount) {
		if(amount < 0) {
			System.out.println("Cannot deposit negative pounds");
			return;
		} else {
			balance += amount;
			System.out.println(amount + " deposited. Balance: " + balance);
		}
		  
	}

	void Withdraw(double amount) {
		if(amount > balance || amount < 0) {
			System.out.println("Cannot withdraw > balance");
			return;
		} balance -= amount;
		  System.out.println(amount + " withdrawn. Balance: " + balance);
	}

// Constructor
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
// getDetails method	
	
	public void getDetails() {
		System.out.println("ID: " + id + ", Owner: " + owner + ", Balance: £" + balance);
	}
	
// Interest method
	public void addInterest() {
		double interest = balance * 0.025;
		balance += interest;
	} 

	
}


