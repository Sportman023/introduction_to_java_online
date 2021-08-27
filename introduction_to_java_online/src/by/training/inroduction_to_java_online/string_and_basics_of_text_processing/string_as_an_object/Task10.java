package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Строка X состоит из нескольких предложений,
 * каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 * 
 * @author Vadim Ortman
 */

public class Task10 {

	public static void main(String[] args) {
		String string = "String and basics of text processing. Work with String as object.";
		int sentencesNumber = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '.' || string.charAt(i) == '!' ||
					string.charAt(i) == '?') {
				sentencesNumber++;
			}
		}
		System.out.println("There are " + sentencesNumber + " sentense(s) in the string \"" + string + "\"");
	}
}
