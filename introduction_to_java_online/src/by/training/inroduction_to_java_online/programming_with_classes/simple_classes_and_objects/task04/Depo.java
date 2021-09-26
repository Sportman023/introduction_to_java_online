package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects.task04;

public class Depo {
	private static final int MAX_TRAIN_NUMBER = 5;
	Train[] trains;
	{
		trains = new Train[MAX_TRAIN_NUMBER];
	}

	public Depo() {
	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	public void addTrain(Train train) {
		for (int i = 0; i < MAX_TRAIN_NUMBER; i++) {
			if (trains[i] == null) {
				trains[i] = train;
				break;
			}
		}
	}

}
