package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task04;

import java.util.ArrayList;
import java.util.Collections;

public class Logic {
	public Logic() {
		
	}
	
	public void blockAccount(Account account) {
		account.setAvailability(false);
	}
	public void unblockAccount(Account account) {
		account.setAvailability(true);
	}
	public Account searchAccountByNumber(Client client, String askedAccountNumber) {
		ArrayList<Account> accounts;
		accounts = client.getAccounts();
		
		for (int i = 0; i < accounts.size(); i++) {
			String num;
			num = accounts.get(i).getAccountNumber();
			if (num.equals(askedAccountNumber)) {
				return accounts.get(i);	
			}
		}
		return null;
	}
	public void sortAccountsByName(Client client) {
		ArrayList<Account> accounts;
		ArrayList<Account> sortedAccountsList = new ArrayList<Account>();
		accounts = client.getAccounts();
		ArrayList<String> accountNumbersList;
		accountNumbersList = new ArrayList<String>();
		for (int i = 0; i < accounts.size(); i++) {
			accountNumbersList.add(accounts.get(i).getAccountNumber());
		}
		Collections.sort(accountNumbersList);
		for (int i = 0; i < accountNumbersList.size(); i++) {
			Account acc;
			acc = searchAccountByNumber(client, accountNumbersList.get(i));
			sortedAccountsList.add(acc);
		}
		client.setAccounts(sortedAccountsList);
	}
	
	public void generateRandomAccounts(Client client) {
		Account account;
		final int ACCOUNTS_QUANTITY = 5;
		for (int i = 0; i <= ACCOUNTS_QUANTITY; i++) {
			account = new Account(client);
			account.setAccountNumber(generateAccountNumber());
			account.setAccountBalance(generateAccountBalance());
		}
	}
	
	
	public String generateAccountNumber() {
		final int ACCOUNT_DIGITALS_NUMBER = 26;
		String accountNumber = new String();
		accountNumber = "BY";
		
		for(int i = 0; i <= ACCOUNT_DIGITALS_NUMBER; i++) {
			accountNumber = accountNumber + (int)(Math.random() * 10);
		}
		return accountNumber;
	}
	public int generateAccountBalance() {
		final int MIN_BALANCE = -100_000;
		final int MAX_BALANCE = 100_000;
		int dif = MAX_BALANCE - MIN_BALANCE;
		int balance;
		
		balance = (int)(Math.random() * dif + MIN_BALANCE + 1);
		return balance;
	}
	
	
}
