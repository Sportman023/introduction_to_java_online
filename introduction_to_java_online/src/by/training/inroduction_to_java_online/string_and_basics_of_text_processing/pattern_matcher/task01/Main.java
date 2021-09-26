package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

/**
 * Задание: Cоздать приложение, разбирающее текст (текст хранится в строке) и
 * позволяющее выполнять с текстом три различных операции: отсортировать абзацы
 * по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 * 
 * @author Vadim Ortman
 */

public class Main {

	public static void main(String[] args) {

		String string = "Hello, mylll anlllame is Vadim. I just try to create sentece number two. The 3rd sennence.\r\n"
				+ "Every dAy AAfter work I leAn JAVAA. It's not enough to have one sentence per paragraph.\r\n"
				+ "I like to learn JAVA.\r\n";

		Logic logic = new Logic();
		View view = new View();
		Text text = new Text();

		logic.generateText(text, string);

//		logic.sortParagraphsByNumberOfSentences(text);
//		logic.sortWordsByLength(text);
		logic.sortWordsByAmountOfAskedChar(text, 'l');
		view.printText(text);

	}

}
