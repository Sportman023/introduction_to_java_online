package by.training.pre_task_numbers.base;

import java.util.Objects;

public class Test {
int a;
	public static void main(String[] args) {
		double a = 123.456789d;
		int b = (int)a;
		int c = (int)((a - b) * 1E9);
		
		int r = (int)(0.09 * 1E9);
		System.out.println(Integer.MAX_VALUE +  r);
		

	}
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return a == other.a;
	}
	

}
