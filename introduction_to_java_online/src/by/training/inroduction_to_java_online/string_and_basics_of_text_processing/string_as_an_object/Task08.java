package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Вводится строка слов, разделенных пробелами. Найти самое длинное
 * слово и вывести его на экран. Случай, когда самых длинных слов может быть
 * несколько, не обрабатывать.
 * 
 * @author Vadim Ortman
 */

public class Task08 {

	public static void main(String[] args) {
		String string = "String and basics of text processing.";
		String theLongestWord = "";
		String temp = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ' || i == string.length() - 1) {
				if (i == string.length() - 1) {
					temp += string.charAt(i);
				}

				if (temp.length() > theLongestWord.length()) {
					theLongestWord = temp;
				}
				temp = "";
			} else {
				temp += string.charAt(i);
			}
		}
		System.out.println(theLongestWord);
	}
}
