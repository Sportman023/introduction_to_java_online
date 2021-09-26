package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task04;

import java.util.ArrayList;

public class View {
	public View() {

	}

	public void printAccountsNumber(Client client) {
		ArrayList<Account> accounts;
		accounts = client.getAccounts();

		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).getAccountNumber());
		}
	}

	public void printTotalBalance(Client client) {
		int totalBalance = 0;
		ArrayList<Account> accounts;
		accounts = client.getAccounts();

		for (int i = 0; i < accounts.size(); i++) {
			totalBalance = totalBalance + accounts.get(i).getAccountBalance();
		}
		System.out.println("�������� ������ �� ��� ������ " + totalBalance);
	}

	public void printTotalPositiveBalance(Client client) {
		int totalBalance = 0;
		ArrayList<Account> accounts;
		int balance;
		accounts = client.getAccounts();

		for (int i = 0; i < accounts.size(); i++) {
			balance = accounts.get(i).getAccountBalance();
			if (balance > 0) {
				totalBalance = totalBalance + accounts.get(i).getAccountBalance();
			}
		}
		System.out.println("�������� ������������� ������ �� ��� ������ " + totalBalance);
	}

	public void printTotalNegativeBalance(Client client) {
		int totalBalance = 0;
		ArrayList<Account> accounts;
		int balance;
		accounts = client.getAccounts();

		for (int i = 0; i < accounts.size(); i++) {
			balance = accounts.get(i).getAccountBalance();
			if (balance < 0) {
				totalBalance = totalBalance + accounts.get(i).getAccountBalance();
			}
		}
		System.out.println("�������� �������������� ������ �� ��� ������ " + totalBalance);
	}
}
