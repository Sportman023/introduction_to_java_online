package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_array;

/**
 * Задание: В строке найти количество чисел.
 * 
 * @author Vadim Ortman
 */

public class Task04 {

	public static void main(String[] args) {
		String string = "I want to earn 1.000.000 dollars per year, but now I earn only 357.894";
		byte[] byteArrOfString;
		int numbersCounter;
		byte ASCII_Code_OF_ZERO = 48;
		byte ASCII_CODE_OF_NINE = 57;
		byte ASCII_CODE_OF_SEPARATOR = 46; //46 is "."
		
		byteArrOfString = string.getBytes();
		numbersCounter = 0;
		
		for(int i = 0; i < byteArrOfString.length; i++) {
			if(byteArrOfString[i] >= ASCII_Code_OF_ZERO && byteArrOfString[i] <= ASCII_CODE_OF_NINE) {
				numbersCounter++;
				
				while (i < byteArrOfString.length && 
						((byteArrOfString[i] >= ASCII_Code_OF_ZERO &&
							byteArrOfString[i] <= ASCII_CODE_OF_NINE) || byteArrOfString[i] == ASCII_CODE_OF_SEPARATOR)) {
					i++;
					
				}
			}
		}
		System.out.println("In the string " + "\"" + string +"\" " + numbersCounter + " digit(s).");

	}

}
