package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task04;

import java.util.ArrayList;

public class Client {
	private ArrayList<Account> accounts;
	private String name;
	public Client() {
		
	}
	
	{
		accounts = new ArrayList<Account>();
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}