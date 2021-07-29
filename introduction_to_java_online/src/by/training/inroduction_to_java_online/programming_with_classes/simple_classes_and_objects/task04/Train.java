package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects.task04;

import java.sql.Time;

public class Train {
	private Depo depo;	
	private TrainLogic trainLogic;
	private TrainView trainView;	
	private String destination;
	private int trainId;
	private Time depurtueTime;
	
	public Train(Depo depo, TrainLogic trainLogic, TrainView trainView) {
		this.depo = depo;
		this.trainLogic = trainLogic;
		this.trainView = trainView;
		this.destination = trainLogic.generateDestination();
		this.trainId = trainLogic.generateTrainId(depo);
		this.depurtueTime = trainLogic.generateTimeDepartue();
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTrainId() {
		return trainId;
	}
	private void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public Time getDepurtueTime() {
		return depurtueTime;
	}
	public void setDepurtueTime(Time depurtueTime) {
		this.depurtueTime = depurtueTime;
	}




	public Depo getDepo() {
		return depo;
	}




	public void setDepo(Depo depo) {
		this.depo = depo;
	}




	public TrainLogic getTrainLogic() {
		return trainLogic;
	}




	public void setTrainLogic(TrainLogic trainLogic) {
		this.trainLogic = trainLogic;
	}




	public TrainView getTrainView() {
		return trainView;
	}




	public void setTrainView(TrainView trainView) {
		this.trainView = trainView;
	}		
		
}
