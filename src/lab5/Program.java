package lab5;

public class Program {

	public static void main(String[] args) {
		
		Account cust1 = new Account(1, "John S.", 200);
		
		cust1.Deposit(100);
		cust1.Withdraw(200);
		
		Account[] accounts = {
				cust1,
				new Account(2, "Jim", 200),
				new Account(3, "Joe", 20),
				new Account(4, "James", 2000)
		};
		
		for (Account account : accounts) {
		    account.getDetails();
		}
			
		Account myAccount = new Account(5, "Me", 100);
		
		myAccount.addInterest();
		myAccount.getDetails();
		
		Account partnerAccount = myAccount;
		
		partnerAccount.getDetails();
	}

}
