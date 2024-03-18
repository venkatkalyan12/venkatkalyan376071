package kalyan.entity;

public class wallet {
	private static double balance;

	public static double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	  public void addBalance(double amount) {
	        balance += amount;
	    }

	    public void deductBalance(double amount) {
	        balance -= amount;
	    }

	
}