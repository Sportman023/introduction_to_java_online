package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task04;

/**
* Задача: Счета. Клиент может иметь несколько счетов в банке.
* Учитывать возможность блокировки/разблокировки счета.
* Реализовать поиск и сортировку счетов.
* Вычисление общей суммы по счетам.
* Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
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
