package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task05;

/**
* ������: ������������� �������.
* ������������ ����� ����������� ������� �� ������ ������������� �������
* ���������� ���� (�����, ���������, �������, ������, ����� � �. �.) ��� ������������ ������. 
* ��������� ����������� ������ ����������, ������� � ����� ����. ����������� ����� � ���������� �������.
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
