package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

import java.sql.Time;

/**
* Задача: Создать класс Airline, спецификация которого приведена ниже.
* Определить конструкторы, set- и get- методы и метод toString().
* Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
* Задать критерии выбора данных и вывести эти данные на консоль.
* Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
* Найти и вывести:
* a) список рейсов для заданного пункта назначения;
* b) список рейсов для заданного дня недели;
* c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*
*/
public class SimpleClassesAndObjectsTask10 {

	public static void main(String[] args) {
		Airline[] airlines;
		String[] destinations = {"Kiew", "Vilnius", "Moscow", "Warsaw", "Paris"};
		String[] planeTypes = {"Airbus A380", "Boeing 747-400", "Business jet", "Douglas DC-3", "Tupolev Tu-144"};
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		airlines = new SimpleClassesAndObjectsTask10.Airline[5];
		
		for (int i = 0; i < airlines.length; i++) {
			String destination = destinations[(int)(Math.random() * destinations.length)];
			String planeType = planeTypes[(int)(Math.random() * planeTypes.length)];
			String weekDay = weekDays[(int)(Math.random() * weekDays.length)];
			airlines[i] = new SimpleClassesAndObjectsTask10().new Airline(destination, generateFlightNumber(), planeType, randomTime(), weekDay);
		}
		
		for (Airline airline : airlines) {
			System.out.println(airline.toString());
		}
		
		String desiredDestination = destinations[(int)(Math.random() * destinations.length)];
		
		System.out.println("\nA flight list of destination " + desiredDestination);
		for (Airline airline : airlines) {
			if (airline.getDestination().equals(desiredDestination)) {
				System.out.println(airline.toString());
			}
		}
		
		String desiredWeekDay = weekDays[(int)(Math.random() * destinations.length)];
		
		System.out.println("\nA flight list on " + desiredWeekDay);
		for (Airline airline : airlines) {
			if (airline.getWeekDay().equals(desiredWeekDay)) {
				System.out.println(airline.toString());
			}
		}
		
		Time desiredTime = new Time(10,00,00);
		System.out.println("\nA flight list on " + desiredWeekDay + "and after " + desiredTime);
		for (Airline airline : airlines) {
			if (airline.getWeekDay().equals(desiredWeekDay) && airline.getDepurtueTime().after(desiredTime)) {
				System.out.println(airline.toString());
				
			}
		}
	
	}	
		private static Time randomTime() {
			int hours;
			int minutes;
			int seconds;
			hours = (int)(Math.random() * 24);
			minutes = (int)(Math.random() * 60);
			seconds = (int)(Math.random() * 60);
			
			return new Time(hours, minutes, seconds);
		}
		
		private static String generateFlightNumber() {
			String flightNumber;
			int abcNumbers = 26;
			flightNumber = (char)(Math.random() * abcNumbers + (int)'A') + "" + 
					(char)(Math.random() * abcNumbers + (int)'A') +  "-" + (int)(Math.random() * 8999 + 1000);
			return flightNumber;
		}
	
	private class Airline{
		private String destination;
		private String flightNumber;
		private String planeType;
		private Time depurtueTime;
		private String weekDay;
		
		public Airline(String destination, String flightNumber, String planeType, Time depurtueTime, String weekDay) {
			this.destination = destination;
			this.flightNumber = flightNumber;
			this.planeType = planeType;
			this.depurtueTime = depurtueTime;
			this.weekDay = weekDay;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getPlaneType() {
			return planeType;
		}

		public void setPlaneType(String planeType) {
			this.planeType = planeType;
		}

		public Time getDepurtueTime() {
			return depurtueTime;
		}

		public void setDepurtueTime(Time depurtueTime) {
			this.depurtueTime = depurtueTime;
		}

		public String getWeekDay() {
			return weekDay;
		}

		public void setWeekDay(String weekDay) {
			this.weekDay = weekDay;
		}
		public String toString() {
			return destination + " " + flightNumber + " " + planeType 
					+ " " + depurtueTime + " " + weekDay;
		}
		
	}

}
