package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task04;

public class Account {
	private Client client;
	private boolean availability;
	private String accountNumber;
	private int accountBalance;
	
	{
		availability = true;
	}
	public Account(Client client) {
		this.client = client;
		client.getAccounts().add(this);
	}
	
	
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public int getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
