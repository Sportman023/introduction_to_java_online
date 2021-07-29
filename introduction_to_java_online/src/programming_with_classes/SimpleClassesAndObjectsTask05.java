package programming_with_classes;

/**
* Задача: Опишите класс, реализующий десятичный счетчик,
* который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
* Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
* Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
* Написать код, демонстрирующий все возможности класса.
*
*/
public class SimpleClassesAndObjectsTask05 {

	public static void main(String[] args) {
		Counter cntr = new SimpleClassesAndObjectsTask05().new Counter();
		System.out.println(cntr.getCurrentValue());
//демонтсрация увеличения
		for (int i = cntr.getMinValue(); i < cntr.getMaxValue(); i++) {
			cntr.increaseValue();					
			System.out.println(cntr.getCurrentValue());
		}
// демонтсрация уменьшения
		for (int i = cntr.getMaxValue(); i > cntr.getMinValue(); i--) {
			cntr.decreaseValue();
			System.out.println(cntr.getCurrentValue());
		}
// присваивание значения
		cntr.setCurrentValue(77);
		System.out.println(cntr.getCurrentValue());
	}
	
	private class Counter{
		private int[] currentValue = new int [3];
		private int minValue = 0;
		private int maxValue = 100;

		public Counter() {
			setCurrentValue(minValue);
		}
		
		public String getCurrentValue() {
			String result = "";
			for (int i = 0; i < currentValue.length; i++) {
				result = result + currentValue[i];
			}
			return result;
		}
		
		public void setCurrentValue(int newVal) {
			int arrLength = this.currentValue.length;
			
			for (int i = 0; i < arrLength; i++) {
				currentValue[i] = (newVal % (int)Math.pow(10, arrLength - i) - newVal 
						 				% (int)Math.pow(10, arrLength - i - 1)) / (int)Math.pow(10, arrLength - i - 1);
			}
			checkRange();
		}
		
		public int getMinValue() {
			return minValue;
		}

		public void setMinValue(int minValue) {
			this.minValue = minValue;
		}

		public int getMaxValue() {
			return maxValue;
		}

		public void setMaxValue(int maxValue) {
			this.maxValue = maxValue;
		}

		public void increaseValue() {
			int step = 1;
			for (int i = currentValue.length - 1; i >= 0; i--) {
				currentValue[i] = (currentValue[i] + step) % 10;
				if (currentValue[i] > 0) {
					break;
				}
			}
			checkRange();
		}
		
		public void decreaseValue() {
			int step = 1;
			for (int i = currentValue.length - 1; i >= 0; i--) {
				currentValue[i] = (currentValue[i] - step) % 10;
				if (currentValue[i] >= 0) {
					break;
				} else {
					currentValue[i] = 9;
				}
			}
			checkRange();
		}
		
		private void checkRange() {
			int currVal = 0;
			int newVal;
			int arrLength = currentValue.length;
			
			for (int i = 0; i < arrLength; i++) {
				currVal = currVal + currentValue[i] * (int)Math.pow(10, arrLength - i - 1);				
			}
			
			if (currVal > maxValue) {
				newVal = maxValue;
			} else if (currVal < minValue) {
				newVal = minValue;
			} else {
				newVal = currVal;
			}
			
			if (currVal != newVal) {
				for (int i = 0; i < arrLength; i++) {
					currentValue[i] = (newVal % (int)Math.pow(10, arrLength - i) - newVal 
							 				% (int)Math.pow(10, arrLength - i - 1)) / (int)Math.pow(10, arrLength - i - 1);
				}
			}
			
		}		
	}
}
