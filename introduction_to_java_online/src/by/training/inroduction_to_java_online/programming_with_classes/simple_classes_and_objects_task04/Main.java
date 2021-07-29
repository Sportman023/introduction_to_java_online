package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects_task04;

/**
* Задача: Создайте класс Train, 
* содержащий поля: название пункта назначения, номер поезда, время отправления.
* Создайте данные в массив из пяти элементов типа Train,
* добавьте возможность сортировки элементов массива по номерам поездов.
* Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
* Добавьте возможность сортировки массив по пункту назначения,
* причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
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
