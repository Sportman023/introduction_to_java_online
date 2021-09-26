package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Проверить, является ли заданное слово палиндромом.
 * 
 * @author Vadim Ortman
 */

public class Task03 {

	public static void main(String[] args) {
		String string = "papap";
		boolean isPolindrome = true;
		int stringLength;

		stringLength = string.length();

		for (int i = 0; i < stringLength / 2; i++) {
			if (string.charAt(i) != string.charAt(stringLength - i - 1)) {
				isPolindrome = false;
			}
		}
		if (isPolindrome) {
			System.out.println("Word \"" + string + "\" is poliandrome.");
		} else {
			System.out.println("Word \"" + string + "\" is not poliandrome.");
		}
	}

}
