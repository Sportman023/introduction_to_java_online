package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Вводится строка. Требуется удалить из нее повторяющиеся символы и
 * все пробелы. Например, если было введено "abc cde def", то должно быть
 * выведено "abcdef".
 * 
 * @author Vadim Ortman
 */

public class Task07 {

	public static void main(String[] args) {
		String string = "abc cde def";
		String tempString = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				tempString = tempString + string.charAt(i);
			}
		}

		string = tempString;
		tempString = "";

		for (int i = 0; i < string.length(); i++) {
			boolean isMet = false;
			for (int j = 0; j < i; j++) {
				if (string.charAt(i) == string.charAt(j)) {
					isMet = true;
					break;
				}
			}
			if (!isMet) {
				tempString += string.charAt(i);
			}
		}
		string = tempString;
		System.out.println(string);
	}
}
