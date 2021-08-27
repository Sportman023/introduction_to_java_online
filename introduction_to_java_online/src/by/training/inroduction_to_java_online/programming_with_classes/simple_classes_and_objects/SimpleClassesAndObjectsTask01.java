package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* Задача: Создайте класс Test1 двумя переменными.
* Добавьте метод вывода на экран и методы изменения этих переменных.
* Добавьте метод, который находит сумму значений этих переменных, и метод,
* который находит наибольшее значение из этих двух переменных.
*
*/
public class SimpleClassesAndObjectsTask01 {
	public static void main(String[] args) {
		
		Test1 tst = new SimpleClassesAndObjectsTask01().new Test1();

		tst.setA(20);
		tst.setB(40);
		tst.printA();
		tst.printB();
		System.out.println("Max: " + tst.maxAB());
		System.out.println("Sum: " + tst.summAB());
	}

	private class Test1{
		private int a;
		private int b;
		
		public void printA() {
			System.out.println(a);
		}
		
		public void printB() {
			System.out.println(b);
		}
		
		public void setA(int a) {
			this.a = a;
		}
		
		public void setB(int b) {
			this.b = b;
		}
		
		public int summAB() {
			return a + b;
		}
		
		public int maxAB() {
			return Math.max(a, b);
		}
	}

}
