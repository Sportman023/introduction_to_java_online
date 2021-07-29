package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects_task04;

public class TrainView {
	public TrainView() {
	}
	
	public void printTrainInfo(Train train) {
		if (train != null) {
			System.out.println("Номер поезда: " + train.getTrainId() + " Пункт назначения: " 
					+ train.getDestination() + " Время отправления: " + train.getDepurtueTime());
		}	
	}	
	public void printAllTrainsInfo(Depo depo) {
		Train[] trains;
		trains = depo.getTrains();
		for (Train tr : trains) {
			if (tr != null) {
				tr.getTrainView().printTrainInfo(tr);
			}
		}
	}
}
