package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: С помощью функции копирования и операции конкатенации
 * составить из частей слова “информатика” слово “торт”.
 * 
 * @author Vadim Ortman
 */

public class Task04 {

	public static void main(String[] args) {
		String informatika = "�����������";
		String tort = "";

		tort = tort.concat(String.copyValueOf(informatika.toCharArray(), 7, 1));
		tort = tort.concat(String.copyValueOf(informatika.toCharArray(), 3, 2));
		tort = tort.concat(String.copyValueOf(informatika.toCharArray(), 7, 1));
		
		System.out.println(tort);	
	}
}
