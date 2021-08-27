package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task05;

/**
* Задача: Туристические путевки.
* Сформировать набор предложений клиенту по выбору туристической путевки
* различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
* Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*
*/
public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		
		TouristAgency agency = new TouristAgency();	
		logic.generateVoucher(agency);
		
		view.printAllvouchers(agency.getVouchers());
		
		view.printAllvouchers(logic.filterVouchers(agency));
	}

}
