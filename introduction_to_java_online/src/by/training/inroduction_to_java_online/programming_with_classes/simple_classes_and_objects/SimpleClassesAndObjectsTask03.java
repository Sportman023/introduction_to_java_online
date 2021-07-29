package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* Задача: Создайте класс с именем Student,
* содержащий поля: фамилия и инициалы, номер группы,
* успеваемость (массив из пяти элементов).
* Создайте массив из десяти элементов такого типа.
* Добавьте возможность вывода фамилий и номеров групп студентов,
* имеющих оценки, равные только 9 или 10.
*
*/
public class SimpleClassesAndObjectsTask03 {

	public static void main(String[] args) {
		Student[] st;
		st = new SimpleClassesAndObjectsTask03. Student [10];
		
		for (int i = 0; i < st.length; i++) {
			st[i] = new SimpleClassesAndObjectsTask03().new Student();
			st[i].setName("Stedent name " + i);
			st[i].setGroupeID(i + "00");
			st[i].setMarks(generateMarksArr(st[i]));
		}
		
		for (Student student : st) {
			if (student.isOnlyHighMarks()) {
				System.out.println(student.getName());
				System.out.println(student.getGroupeID());
			}
		}		
		
	}
	private static int[] generateMarksArr(Student student) {
		int[] arrMarks = new int [student.getMarks().length];
		
		for (int i = 0; i < student.getMarks().length; i++) {
			arrMarks[i] = (int)(Math.random() * 4) + 7; //оценки от 7 до 10
		}
		return arrMarks ;
	}
	
	private class Student{
		private String name;
		private String groupeID;
		private static final int marksNumber = 5; // кол-во оценок
		private int[] marks = new int[marksNumber];
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGroupeID() {
			return groupeID;
		}
		public void setGroupeID(String groupeID) {
			this.groupeID = groupeID;
		}
		public int[] getMarks() {
			return marks;
		}
		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		
		public boolean isOnlyHighMarks() {
			boolean isOnlyHighMarks = true;
		
			for (int i : marks) {
				if (i < 9) {
					isOnlyHighMarks = false;
					break;
				}
			}
			return isOnlyHighMarks;
		}
	}
}
	

