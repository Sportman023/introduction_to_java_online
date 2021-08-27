package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_array;

import java.util.Iterator;

/**
 * Задание: Дан массив названий переменных в camelCase.
 * Преобразовать названия в snake_case.
 * 
 * @author Vadim Ortman
 */

public class Task01 {

	public static void main(String[] args) {
		String[] array = {"userName", "userId", "jobTitle", "departmentName"};
		byte WORD_SEPARATOR = 95;
		byte OFFSET_TO_LOWERCASE_LETTER = 32;
		
		System.out.println("Words in camelCase");
		for (String word : array) {
			System.out.print(word + "; ");
		}
		
		for (int j = 0; j < array.length; j++) {
			byte[] byteArrOfString;
			int capitalLettersNumber;
			byte[] tempArr;
			
			byteArrOfString = array[j].getBytes();
			capitalLettersNumber = 0;
			
			for (byte letterByteCode : byteArrOfString) {
				if (letterByteCode >= 65 && letterByteCode <= 90) {
					capitalLettersNumber++;
				}
			}
			
			tempArr = new byte[byteArrOfString.length + capitalLettersNumber];
			int offset = 0;
			
			for(int i = 0; i < byteArrOfString.length; i++) {
				if (byteArrOfString[i] >= 65 && byteArrOfString[i] <= 90 ) {
					tempArr[i + offset] = WORD_SEPARATOR;
					offset++;
					tempArr[i + offset] = (byte)(byteArrOfString[i] + OFFSET_TO_LOWERCASE_LETTER);
				} else {
					tempArr[i + offset] = byteArrOfString[i];
				}
			}
			array[j] = new String(tempArr);	
		}

		System.out.println("\n\nWords in snake_case");
		for (String word : array) {
			System.out.print(word + "; ");
		}
	}
}