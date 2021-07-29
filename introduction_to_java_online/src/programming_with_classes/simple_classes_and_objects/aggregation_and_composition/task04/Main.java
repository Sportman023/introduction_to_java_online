package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task04;

/**
* ������: �����. ������ ����� ����� ��������� ������ � �����.
* ��������� ����������� ����������/������������� �����.
* ����������� ����� � ���������� ������.
* ���������� ����� ����� �� ������.
* ���������� ����� �� ���� ������, ������� ������������� � ������������� ������� ��������.
*
*/
public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		Client clent = new Client();
		
		logic.generateRandomAccounts(clent);
		
		
		view.printAccountsNumber(clent);
		System.out.println();
		logic.sortAccountsByName(clent);
		view.printAccountsNumber(clent);
		view.printTotalBalance(clent);
		view.printTotalPositiveBalance(clent);
		view.printTotalNegativeBalance(clent);
	}

}
