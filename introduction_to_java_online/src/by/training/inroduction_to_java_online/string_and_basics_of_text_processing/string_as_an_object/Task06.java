package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Из заданной строки получить новую, повторив каждый символ дважды.
 * 
 * @author Vadim Ortman
 */

public class Task06 {

	public static void main(String[] args) {
		String string = "String and basics of text processing.";
		String newString = "";

		for (int i = 0; i < string.length(); i++) {
			newString = newString + (String.valueOf(string.charAt(i))).repeat(2);
		}
		System.out.println(newString);
	}
}
