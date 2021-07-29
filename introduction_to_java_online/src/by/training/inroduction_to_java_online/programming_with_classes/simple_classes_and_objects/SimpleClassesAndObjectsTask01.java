package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* ������: �������� ����� Test1 ����� �����������.
* �������� ����� ������ �� ����� � ������ ��������� ���� ����������.
* �������� �����, ������� ������� ����� �������� ���� ����������, � �����,
* ������� ������� ���������� �������� �� ���� ���� ����������.
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
