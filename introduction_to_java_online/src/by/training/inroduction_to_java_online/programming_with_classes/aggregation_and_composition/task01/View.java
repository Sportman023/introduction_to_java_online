package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task01;

public class View {
	public View() {
		
	}
	
	public void printText(Text text) {
		int size;
		
		System.out.println(text.getTitle());
		
		size = text.getSentencesList().size();
		for (int i = 0; i < size; i++) {
			printSentence(text.getSentencesList().get(i));
		}
	}
	public void printSentence(Sentence sentence) {
		int size;
		size = sentence.getWordsList().size();
		for (int i = 0; i < size; i++) {
			printWord(sentence.getWordsList().get(i));
		}
	}
	public void printWord(Word word) {
		System.out.print(word.value);
	}
}
