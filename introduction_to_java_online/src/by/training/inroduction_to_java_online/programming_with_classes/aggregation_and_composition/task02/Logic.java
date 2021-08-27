package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task02;

import java.util.ArrayList;

public class Logic {

	
	public Logic() {
		
	}
	
	public boolean readyToDrive(Car car) {
		boolean readiness = false;
		car.getEngine().setEngineStatus(true);
		 if (car.getWheels().size() >= 4) {
			 readiness = true;
		 }
		return readiness;
	}
	
	public void replaceWheel(Car car, String position) {
		ArrayList<Wheel> wheels = car.getWheels();
		for (int i = 0; i < wheels.size(); i ++) {
			if (wheels.get(i).getPosition().equals(position)) {
				wheels.remove(i);
			}
		}
		Wheel newWheel = new Wheel(car);
		newWheel.setPosition(position);
		System.out.println("The wheel is replaced.");
	}
}
