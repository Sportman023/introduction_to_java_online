package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* Задача: Создать класс Book, спецификация которого приведена ниже.
* Определить конструкторы, set- и get- методы и метод toString().
* Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
* Задать критерии выбора данных и вывести эти данные на консоль.
* Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
* Найти и вывести:
* a) список книг заданного автора;
* b) список книг, выпущенных заданным издательством;
* c) список книг, выпущенных после заданного года.
*
*/

public class SimpleClassesAndObjectsTask09 {

	public static void main(String[] args) {
		String[] names = {"Core Java Volume I � Fundamentals", "Effective Java", "Java: A Beginner�s Guide",
				"Java - The Complete Reference", "Head First Java"};
		String[] authors = {"Cay S. Horstmann", "Joshua Bloch", "Herbert Schildt", "Herbert Schildt",
				"Kathy Sierra & Bert Bates"};
		String[] publishingHouse = {"Prentice Hall", "Addison Wesley", "McGraw-Hill Education",
				"McGraw-Hill Education", "Shroff/O�Reilly"};
		int[] publishingYear = {2019, 2017, 2019, 2019, 2018};
		int[] pagesNumber = {843, 600, 667, 1167, 670};
		int[] price = {2203, 4386, 2550, 4300, 2000};
		String[] bindingType = {"Hardcover", "Hardcover", "Hardcover", "Softcover", "Hardcover"};
		
		Book[] book;
		book = new SimpleClassesAndObjectsTask09.Book[5];
		
		for (int i = 0; i < book.length; i++) {
			book[i] = new SimpleClassesAndObjectsTask09().new Book(names[i], authors[i], publishingHouse[i], publishingYear[i], pagesNumber[i], price[i], bindingType[i]);
		}
		
		System.out.println("����� ������ Joshua Bloch");
		for (int i = 0; i < book.length; i++) {
			if (book[i].authors.equals("Joshua Bloch")) {
				System.out.println(book[i].toString());
			}
		}
		
		System.out.println("����� ������������� ���� McGraw-Hill Education");
		for (int i = 0; i < book.length; i++) {
			if (book[i].publishingHouse.equals("McGraw-Hill Education")) {
				System.out.println(book[i].toString());
			}
		}
		
		System.out.println("����� �������� ����� 2018 ���");
		for (int i = 0; i < book.length; i++) {
			if (book[i].publishingYear > 2018) {
				System.out.println(book[i].toString());
			}
		}
		
		

	}
	private class Book{
		private static int idCounter;
		private int id;
		private String name;
		private String authors;
		private String publishingHouse;
		private int publishingYear;
		private int pagesNumber;
		private int price;
		private String bindingType;
		
		public Book(String name, String authors, String publishingHouse, int publishingYear,
					int pagesNumber, int price, String bindingType) {
			id = idCounter++;
			this.name = name;
			this.authors = authors;
			this.publishingHouse = publishingHouse;
			this.publishingYear = publishingYear;
			this.pagesNumber = pagesNumber;
			this.price = price;
			this.bindingType = bindingType;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthors() {
			return authors;
		}
		public void setAuthors(String authors) {
			this.authors = authors;
		}
		public String getPublishingHouse() {
			return publishingHouse;
		}
		public void setPublishingHouse(String publishingHouse) {
			this.publishingHouse = publishingHouse;
		}
		public int getPublishingYear() {
			return publishingYear;
		}
		public void setPublishingYear(int publishingYear) {
			this.publishingYear = publishingYear;
		}
		public int getPagesNumber() {
			return pagesNumber;
		}
		public void setPagesNumber(int pagesNumber) {
			this.pagesNumber = pagesNumber;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getBindingType() {
			return bindingType;
		}
		public void setBindingType(String bindingType) {
			this.bindingType = bindingType;
		}
		public int getId() {
			return id;
		}
		public String toString() {
			return id + " " + name + " " + authors + " " + publishingHouse + " " + publishingYear
					 + " " + pagesNumber + " " + price / 100.0 + " " + bindingType;
		}
	}

}
