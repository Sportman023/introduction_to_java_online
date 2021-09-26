package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: Посчитать количество строчных (маленьких) и прописных (больших) букв
 * в введенной строке. Учитывать только английские буквы.
 * 
 * @author Vadim Ortman
 */

public class Task09 {

	public static void main(String[] args) {
		String string = "String and basics of text processing.";
		int lowerCaseLettersNumber = 0;
		int UpperCaseLettersNumber = 0;
		byte A = 65;
		byte Z = 90;
		byte a = 97;
		byte z = 122;

		for (int i = 0; i < string.length(); i++) {
			if ((byte) string.charAt(i) >= A && (byte) string.charAt(i) <= Z) {
				UpperCaseLettersNumber++;
			}
			if ((byte) string.charAt(i) >= a && (byte) string.charAt(i) <= z) {
				lowerCaseLettersNumber++;
			}
		}

		System.out.println("There are " + lowerCaseLettersNumber + " letter(s) in lower case and "
				+ UpperCaseLettersNumber + " letter(s) in upper case in the string \"" + string + "\"");
	}
}
