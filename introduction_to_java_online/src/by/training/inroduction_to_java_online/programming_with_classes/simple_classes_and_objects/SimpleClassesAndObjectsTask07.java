package by.training.inroduction_to_java_online.programming_with_classes.simple_classes_and_objects;

/**
* Задача: Описать класс, представляющий треугольник.
* Предусмотреть методы для создания объектов,
* вычисления площади, периметра и точки пересечения медиан.
*
*/
public class SimpleClassesAndObjectsTask07 {

	public static void main(String[] args) {
		Triangle triangle = new SimpleClassesAndObjectsTask07(). new Triangle(3, 3, 3);
		System.out.println("Area = " + triangle.area());
		System.out.println("Perimeter = " + triangle.perimeter());
		System.out.println("x3 = " + triangle.x3 + " y3 = " + triangle.y3);
		System.out.println(triangle.medianIntersections());
		
	}
	private class Triangle{
		private int a;
		private int b;
		private int c;
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		public double x3;
		public double y3;
		
		
		public Triangle(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
			x1 = 0;
			y1 = 0;
			x2 = b;
			y2 = 0;
			x3 = (Math.pow(x2, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * x2);
			y3 = Math.sqrt(Math.pow(a, 2) - Math.pow(x3, 2));
		}
		
		public double area () {
			double sp; // semi-perimeter
			double result;
			
			sp = perimeter()/2.0;
			result = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
			
			return result;
		}
		
		public int perimeter() {
			return a + b + c;
		}
		
		public String medianIntersections() {
		String result;
		double xA; //�������� ������� c (���������� x)
		double yA; //�������� ������� c (���������� y)
		
		double xC = b / 2.0; //�������� ������� b (���������� x)
		double yC = 0; //�������� ������� b (���������� y)
		
		double xO; // ����������� ������ (���������� x)
		double yO; // ����������� ������ (���������� y)
		xA = (x2 + x3) / 2.0;
		yA = (y2 + y3) / 2.0;
		
		xO = (x1 + 2 * xA) / 3.0;
		yO = (y1 + 2 * yA) / 3.0;
		result = "(x = " + xO + ", y = " + yO + ")";
		return result;
		}
	}
}
