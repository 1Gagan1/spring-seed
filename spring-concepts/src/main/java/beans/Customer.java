package beans;

public class Customer {
	
	private String name;
	private Account account;
	
	public Customer(String name, Account account) {
		this.account = account;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Account getAccount() {
		return account;
	}
	

}
