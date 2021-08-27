package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task03;
/**
* Задача: Создать объект класса Государство, используя классы Область, Район, Город.
* Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
*
*/
public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		
		Country country = new Country(logic, view);
		country.setName("Беларусь");
		country.setArea(27600);
		
		view.printCapital(country);
		view.printRegionsQuantity(country);
		view.printCountryArea(country);
		view.printRegionsCapital(country);
	}

}
