package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects.task04;

import java.sql.Time;
import java.util.Scanner;

public class TrainLogic {

	public TrainLogic() {
	}

	public int generateTrainId(Depo depo) {
		Train[] trains;
		trains = depo.getTrains();
		boolean isUsed;
		int trId;
		do {
			final int MAX_TRAIN_ID = 100;
			trId = (int) (Math.random() * MAX_TRAIN_ID + 1);
			isUsed = false;
			// �������� trainId �� ������������
			for (Train tr : trains) {
				if (tr != null && tr.getTrainId() == trId) {
					isUsed = true;
					break;
				}
			}
		} while (isUsed);
		return trId;
	}

	public String generateDestination() {
		String[] destinations = { "Vitebsk", "Brest", "Grodno", "Mogilev", "Grodno" };
		String dest;
		dest = destinations[(int) (Math.random() * destinations.length)];
		return dest;
	}

	public Time generateTimeDepartue() {
		int hours;
		int minutes;
		int seconds;
		hours = (int) (Math.random() * 24);
		minutes = (int) (Math.random() * 60);
		seconds = (int) (Math.random() * 60);

		return new Time(hours, minutes, seconds);
	}

	public Train[] sortArrByDepurtueTime(Depo depo) {
		Train[] trains;
		trains = depo.getTrains();
		Train temp;
		int changeCounter;
		do {
			changeCounter = 0;
			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].getDepurtueTime().compareTo(trains[i + 1].getDepurtueTime()) > 0) {
					temp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = temp;
					changeCounter++;
				}
			}
		} while (changeCounter > 0);
		return trains;
	}

	public Train[] sortArrByTrainId(Depo depo) {
		Train[] trains;
		trains = depo.getTrains();
		Train temp;
		int changeCounter;
		do {
			changeCounter = 0;
			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].getTrainId() > trains[i + 1].getTrainId()) {
					temp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = temp;
					changeCounter++;
				}
			}
		} while (changeCounter > 0);
		return trains;
	}

	public Train[] sortArrByDestination(Train[] array, int startChar) {

		boolean isChanged;

		do {
			isChanged = false;
			for (int i = 0; i < array.length - 1; i++) {
				int unicodeOfChar0;
				int unicodeOfChar1;

				String destinationAndDepTime0;
				String destinationAndDepTime1;

				destinationAndDepTime0 = array[i].getDestination() + array[i].getDepurtueTime();
				destinationAndDepTime1 = array[i + 1].getDestination() + array[i + 1].getDepurtueTime();

				if (startChar == destinationAndDepTime0.length()) {
					unicodeOfChar0 = 0;
				} else {
					unicodeOfChar0 = (int) destinationAndDepTime0.toLowerCase().charAt(startChar);
				}

				if (startChar == destinationAndDepTime1.length()) {
					unicodeOfChar1 = 0;
				} else {
					unicodeOfChar1 = (int) destinationAndDepTime1.toLowerCase().charAt(startChar);
				}

				if (unicodeOfChar0 > unicodeOfChar1) {

					Train temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isChanged = true;

				} else if (unicodeOfChar0 == unicodeOfChar1) {
					if (destinationAndDepTime0.length() > startChar || destinationAndDepTime1.length() > startChar) {
						Train[] arrTemp = { array[i], array[i + 1] };

						arrTemp = sortArrByDestination(arrTemp, startChar + 1);
						if (array[i].equals(arrTemp[0]) == false) {
							array[i] = arrTemp[0];
							array[i + 1] = arrTemp[1];
							isChanged = true;
						}
					}

				}

			}
		} while (isChanged);

		return array;
	}

	public Train searchTrainById(int id, Depo depo) {
		Train[] trains;
		trains = depo.getTrains();
		for (Train tr : trains) {
			if (tr.getTrainId() == id) {
				return tr;
			}
		}
		System.out.println("Train Id " + id + " is not exist");
		return null;
	}

	public int askTrainId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter train Id");
		return scanner.nextInt();
	}
}