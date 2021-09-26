package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Дан текст (строка). Найдите наибольшее количество подряд идущих
 * пробелов в нем.
 * 
 * @author Vadim Ortman
 */

public class Task01 {

	public static void main(String[] args) {
		String string = "    I want to earn 1 000 000 dollars per year, but now I earn only 357 894.";
		int maxSpacesNumber;
		int spacesNumber;

		char SPACE = ' ';
		maxSpacesNumber = 0;
		spacesNumber = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == SPACE) {
				spacesNumber++;
				if (spacesNumber > maxSpacesNumber) {
					maxSpacesNumber = spacesNumber;
				}
			} else {
				spacesNumber = 0;
			}
		}
		System.out
				.println("The largest number of consecutive spaces in string \"" + string + "\" is " + maxSpacesNumber);
	}
}
