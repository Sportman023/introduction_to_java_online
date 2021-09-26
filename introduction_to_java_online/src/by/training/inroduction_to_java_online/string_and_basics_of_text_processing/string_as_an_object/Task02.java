package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_object;

/**
 * Задание: В строке вставить после каждого символа 'a' символ 'b'.
 * 
 * @author Vadim Ortman
 */

public class Task02 {

	public static void main(String[] args) {
		String string = "I want to earn 1 000 000 dollars per year.";

		System.out.println("Initial string: " + string);

		string = string.replaceAll("a", "ab");

		System.out.println("String with added \"ab\" after every \"a\" : " + string);
	}
}
