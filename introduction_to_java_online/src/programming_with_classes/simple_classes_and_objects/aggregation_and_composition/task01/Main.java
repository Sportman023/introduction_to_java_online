package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task01;
/**
* Задача: Создать объект класса Текст, используя классы Предложение, Слово.
* Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*
*/
public class Main {
	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		Text text = new Text();
		Sentence[] sentence;
		
		text.setTitle("My text.");
		String[][] wordsSet = {{"Hello ", "word! "},{"It ", "is ", "JAVA! "},
				{"And ", "it", "'s ", "my ", "first ", "text."}};
		sentence = new Sentence[wordsSet.length];
		
		for	(int i = 0; i < sentence.length; i++) {
			sentence[i] = new Sentence(text);
			for(int j = 0; j < wordsSet[i].length; j++) {
				new Word(sentence[i]).setValue(wordsSet[i][j]);
			}
		}
		view.printText(text);
	}
}
