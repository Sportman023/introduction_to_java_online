package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task02;
/**
* Задание: Создать объект класса Автомобиль,
* используя классы Колесо, Двигатель. 
* Методы: ехать, заправляться, менять колесо, 
* вывести на консоль марку автомобиля.
*
*/
public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		Wheel[] wheels = new Wheel[4];
		String[] wheelPositions = {"Front-Left","Front-Right","Rare-Left","Rare-Right"};
		Car car = new Car(logic, view);
		
		car.setColor("Red");
		car.setDoorsNumber(4);
		car.getEngine().setFuelType("Petrol");
		
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(car);
			wheels[i].setPosition(wheelPositions[i]);
		}
		
		
		view.drive(logic.readyToDrive(car));
		logic.replaceWheel(car, "Front-Left");
	}

}
