package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_array;

/**
 * Задание: Удалить в строке все лишние пробелы,
 * то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 * 
 * @author Vadim Ortman
 */

public class Task05 {

	public static void main(String[] args) {
		String string = "    I want to earn       1 000 000 dollars per year, but now I earn only 357 894.   ";
		byte[] byteArrOfString;
		byte ASCII_Code_OF_SPACE = 32;
		byte[] tempByteArr;
		int offset;
		
		byteArrOfString = string.getBytes();
		tempByteArr = new byte[string.length()];
		offset = 0;
		
		for(int i = 0; i < byteArrOfString.length; i++) {
			boolean isFirst = i == 0;
			boolean isLast = i == (byteArrOfString.length - 1);
			
			
			if((isFirst && byteArrOfString[i] == ASCII_Code_OF_SPACE) ||
					(isLast && byteArrOfString[i] == ASCII_Code_OF_SPACE) ||
					(isFirst == false && byteArrOfString[i] == ASCII_Code_OF_SPACE && byteArrOfString[i - 1] == ASCII_Code_OF_SPACE)) {
				offset++;
			} else {
				tempByteArr[i - offset] = byteArrOfString[i];
			}
		}
		
		string = new String(tempByteArr);
		System.out.println(string);
		}
	}
