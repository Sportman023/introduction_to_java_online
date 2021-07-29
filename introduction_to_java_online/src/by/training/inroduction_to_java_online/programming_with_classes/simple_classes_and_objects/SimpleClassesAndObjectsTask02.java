package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* Задача: Создйте класс Test2 с двумя переменными.
* Добавьте конструктор с входными параметрами.
* Добавьте конструктор, инициализирующий члены класса по умолчанию.
* Добавьте set- и get- методы для полей экземпляра класса.
*
*/
public class SimpleClassesAndObjectsTask02 {

	public static void main(String[] args) {
		Test2 tst1 = new SimpleClassesAndObjectsTask02().new Test2();
		
		System.out.println(tst1.getA());
		System.out.println(tst1.getB());
		
		Test2 tst2 = new SimpleClassesAndObjectsTask02().new Test2(2, 7);
		
		System.out.println(tst2.getA());
		System.out.println(tst2.getB());
	}
	
	private class Test2 {
		private int a;
		private int b;
		
		public Test2 () {
			a = 10;
			b = 20;
		}
				
		public Test2 (int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
		
	}
}
