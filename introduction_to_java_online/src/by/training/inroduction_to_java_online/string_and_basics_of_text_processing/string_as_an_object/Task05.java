package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * 
 * @author Vadim Ortman
 */

public class Task05 {

	public static void main(String[] args) {
		String string = "String and basics of text processing.";
		int aCounter = 0;
		
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'a') {
				aCounter++;
			}
		}	
		System.out.println("Char \'a\' meats in string \"" + string + "\" " + aCounter + " times.");
	}
}
