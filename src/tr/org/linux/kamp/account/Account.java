package tr.org.linux.kamp.account;

public class Account {
	private String name;
	private double balance;
	
	//constructor
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public Account() {
		
	}
	
	public Account(String name) {
		this.name = name;
	}
	//constructor ends
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	
	//getter ve setterlar test ve erişim için !!avantajı güvenlik
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
