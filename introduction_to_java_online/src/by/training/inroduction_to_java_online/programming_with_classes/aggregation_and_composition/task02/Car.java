package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task02;

import java.util.ArrayList;

public class Car {
	private Logic logic;
	private View view;
	
	private String model;
	private String color;
	private int doorsNumber;
	Engine engine;
	ArrayList<Wheel> wheels;
	
	{
		engine = new Engine (this);
		wheels = new ArrayList<Wheel>();
	}
	
	public Car(Logic logic, View view) {
		
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoorsNumber() {
		return doorsNumber;
	}

	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}
	
}