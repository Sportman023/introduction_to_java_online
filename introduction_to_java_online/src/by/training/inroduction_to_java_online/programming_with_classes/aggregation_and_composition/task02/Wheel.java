package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task02;

public class Wheel {
	private static String size;
	
	private Car car;
	private String position;
	
	
	public Wheel(Car car) {
		this.car = car;
		car.getWheels().add(this);
	}


	public static String getSize() {
		return size;
	}


	public static void setSize(String size) {
		Wheel.size = size;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
}
