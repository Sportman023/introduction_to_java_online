package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

import java.time.LocalDateTime;

/**
 * Задача: Составьте описание класса для представления времени. Предусмотрте
 * возможности установки времени и изменения его отдельных полей (час, минута,
 * секунда) с проверкой допустимости вводимых значений. В случае недопустимых
 * значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 *
 */
public class SimpleClassesAndObjectsTask06 {

	public static void main(String[] args) {
		MyTime myTime = new SimpleClassesAndObjectsTask06().new MyTime();

		System.out.println("Current time " + myTime.getTime());

		myTime.setHour(13);
		myTime.setMinute(20);
		myTime.setSecond(00);

		System.out.println("Setted time " + myTime.getTime());

		myTime.moveTimeOn(01, 10, 10);

		System.out.println("Moved time " + myTime.getTime());
	}

	private class MyTime {
		private int hour;
		private int minute;
		private int second;

		public MyTime() {
			hour = LocalDateTime.now().getHour();
			minute = LocalDateTime.now().getMinute();
			second = LocalDateTime.now().getSecond();
		}

		public String getTime() {
			String h;
			String m;
			String s;
			boolean ms = true;
			h = (hour < 10) ? "0" : "";
			m = (minute < 10) ? "0" : "";
			s = (second < 10) ? "0" : "";

			return h + hour + ":" + m + minute + ":" + s + second;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			if (hour < 0 || hour > 23) {
				this.hour = 0;
			} else {
				this.hour = hour;
			}
		}

		public int getMinute() {
			return minute;
		}

		public void setMinute(int minute) {
			if (minute < 0 || minute > 59) {
				this.minute = 0;
			} else {
				this.minute = minute;
			}
		}

		public int getSecond() {
			return second;
		}

		public void setSecond(int second) {
			if (second < 0 || second > 59) {
				this.second = 0;
			} else {
				this.second = second;
			}
		}

		public void moveTimeOn(int hour, int minute, int second) {
			int addM = 0;
			int addH = 0;

			if ((this.second + second) < 0) {
				addM = (this.second + second) / 60 - 1;
				this.second = 60 + (this.second + second) % 60;
			} else {
				addM = (this.second + second) / 60;
				this.second = (this.second + second) % 60;
			}

			if ((this.minute + minute + addM) < 0) {
				addH = (this.minute + minute + addM) / 60 - 1;
				this.minute = 60 + (this.minute + minute + addM) % 60;
			} else {
				addH = (this.minute + minute + addM) / 60;
				this.minute = (this.minute + minute + addM) % 60;

			}

			if ((this.hour + hour + addH) < 0) {
				this.hour = 24 + (this.hour + hour + addH) % 24;
			} else {
				this.hour = (this.hour + hour + addH) % 24;
			}
		}
	}
}
