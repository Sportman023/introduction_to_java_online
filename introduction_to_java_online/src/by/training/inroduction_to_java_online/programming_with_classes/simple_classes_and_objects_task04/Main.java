package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects_task04;

/**
* ������: �������� ����� Train, 
* ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
* �������� ������ � ������ �� ���� ��������� ���� Train,
* �������� ����������� ���������� ��������� ������� �� ������� �������.
* �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
* �������� ����������� ���������� ������ �� ������ ����������,
* ������ ������ � ����������� �������� ���������� ������ ���� ����������� �� ������� �����������.
*
*/
public class Main {

	public static void main(String[] args) {
		Depo depo = new Depo();
		TrainLogic trainLogic = new TrainLogic();
		TrainView trainView = new TrainView();
		
		for (int i = 0; i < depo.getTrains().length; i++) {
			depo.addTrain(new Train(depo, trainLogic, trainView));
		}
		System.out.println("Initial train list");
		trainView.printAllTrainsInfo(depo);
		
		System.out.println("\nSorted train list by train Id");
		depo.setTrains(trainLogic.sortArrByTrainId(depo));
		trainView.printAllTrainsInfo(depo);
		
		System.out.println("\nSorted train list by destination");
		depo.setTrains(trainLogic.sortArrByDestination(depo.trains, 0));
		trainView.printAllTrainsInfo(depo);
		
		System.out.println("\nTrain info by Id");
		int askedId;
		askedId = trainLogic.askTrainId();
		Train askedTrain;
		askedTrain = trainLogic.searchTrainById(askedId, depo);
		
		trainView.printTrainInfo(askedTrain);
	}
}
