package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_array;

/**
 * Задание: строке найти количество цифр.
 * 
 * @author Vadim Ortman
 */

public class Task03 {

	public static void main(String[] args) {
		String string = "I want to earn 1 000 000 dollars per year, but now I earn only 357 894.";
		byte[] byteArrOfString;
		int digitsCounter;
		byte ASCII_Code_OF_ZERO = 48;
		byte ASCII_CODE_OF_NINE = 57;

		byteArrOfString = string.getBytes();
		digitsCounter = 0;

		for (int i = 0; i < byteArrOfString.length; i++) {
			if (byteArrOfString[i] >= ASCII_Code_OF_ZERO && byteArrOfString[i] <= ASCII_CODE_OF_NINE) {
				digitsCounter++;
			}
		}
		System.out.println("In string " + "\"" + string + "\" " + digitsCounter + " digits.");
	}

}
