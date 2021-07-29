package by.training.inroduction_to_java_online.programming_with_classes;


/**
* Задача: Создать класс Customer, спецификация которого приведена ниже.
* Определить конструкторы, set- и get- методы и метод toString().
* Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
* Задать критерии выбора данных и вывести эти данные на консоль.
* 
* Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
* Найти и вывести:
* a) список покупателей в алфавитном порядке;
* b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*
*/

public class SimpleClassesAndObjectsTask08 {

	public static void main(String[] args) {
		
		Customer[] customer;
		String[] surnames = {"Иванов", "Петров", "Сидоров", "Синицин", "Чижиков", "Рижиков","Кузнецов","Мюллер"};
		String[] names = {"Василий", "Петр", "Семен", "Валерий", "Алексей", "Владимир", "Виталий", "Яраслав"};
		String[] patronymics = {"Васильевич", "Петрович", "Семенович", "Валерьевич",
				"Алексеевич", "Владимирович", "Витальевич", "Яраславович"};
		long[] cardNumbers = {4484_0048_7405_7655L, 4024_0071_8298_5696L, 4024_0071_2957_1591L, 4716_2812_5976_5892L,
				4916_3495_8549_8617L};
		long[] accountNumbers = {4874057655448400L, 8298569640240071L, 2957159140240071L, 2597658924716281L, 8549861749163495L};
		
		customer = new SimpleClassesAndObjectsTask08.Customer [5];
		
		for (int i = 0; i < customer.length; i++) {
			String surname = surnames[(int)(Math.random() * surnames.length)];
			String name = names[(int)(Math.random() * names.length)];
			String patronymic = patronymics[(int)(Math.random() * patronymics.length)];
			long cardNumber = cardNumbers[i];
			long accountNumber = accountNumbers[i];		
			customer[i] = new SimpleClassesAndObjectsTask08().new Customer(surname, name, patronymic, cardNumber, accountNumber);
		}
		
		Customer.sortArrByFullName(customer, 0);
		System.out.println("Список заказчиков отсортированный по фамилии, имени, отчеству");
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i].toString());
		}	
		System.out.println();
		
		System.out.println("Список заказчиков номера кредитных карт которых расположены в диапозоне "
				+ 4024_0071_2957_1591L + " - " + 4484_0048_7405_7655L);
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCardNumber() >= 4024_0071_2957_1591L && customer[i].getCardNumber() <= 4484_0048_7405_7655L) {
				System.out.println(customer[i].toString());
			}
		}
	}
	private class Customer{
		private static int idCounter = 0;
		
		private int id;
		private String surname;
		private String name;
		private String patronymic;
		private long cardNumber;
		private long accountNumber;

		public Customer(String surname, String name, String patronymic, long cardNumber, long accountNumber) {
			id = idCounter++;
			
			setSurname(surname);
			setName(name);
			setPatronymic(patronymic);
			setCardNumber(cardNumber);
			setAccountNumber(accountNumber);			
		}
		

		
		public int getId() {
			return id;
		}

		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPatronymic() {
			return patronymic;
		}
		public void setPatronymic(String patronymic) {
			this.patronymic = patronymic;
		}
		public long getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(long cardNumber) {
			this.cardNumber = cardNumber;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}		
		public String toString() {
			return "id: " + id + ", " + surname + " " + name + " " + patronymic 
					+ ", номер кредитной катры: " + cardNumber + ", номер банковского счета: " + accountNumber;
		}
		
		public static Customer[] sortArrByFullName(Customer[] array, int startChar) {

			boolean isChanged;
			
			do {
				isChanged = false;
				for (int i = 0; i < array.length - 1; i++) {
					 int unicodeOfChar0;
					 int unicodeOfChar1;
					 
					 String fullName0;
					 String fullName1;
					 
					 fullName0 = array[i].surname + array[i].name + array[i].patronymic;
					 fullName1 = array[i + 1].surname + array[i + 1].name + array[i + 1].patronymic;
					 
					 if (startChar == fullName0.length()) {
						 unicodeOfChar0 = 0;
					 } else {
						 unicodeOfChar0 = (int)fullName0.toLowerCase().charAt(startChar);
					 }
					 
					 if (startChar == fullName1.length()) {
						 unicodeOfChar1 = 0;
					 } else {
						 unicodeOfChar1 = (int)fullName1.toLowerCase().charAt(startChar);
					 }
					
					if (unicodeOfChar0 > unicodeOfChar1) {
												
						Customer temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						isChanged = true;
					} else if (unicodeOfChar0 == unicodeOfChar1) {
						if (fullName0.length() > startChar || fullName1.length() > startChar) {
							Customer[] arrTemp = {array[i], array[i + 1]};
							
							arrTemp = sortArrByFullName(arrTemp, startChar + 1);
							if (array[i].equals(arrTemp[0]) == false) {
								array[i] = arrTemp[0];
								array[i + 1] = arrTemp[1];
								isChanged = true;
							}
						}
					}
				}	
			} while (isChanged);
			return array;	
		}	
	}
}