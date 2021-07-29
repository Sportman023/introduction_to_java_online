package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task01;

import java.util.ArrayList;

public class Sentence {
	private ArrayList<Word> wordsList;
	private Text text;
	
	public Sentence(Text text) {
		this.text = text;
		wordsList = new ArrayList<Word>();
		this.text.getSentencesList().add(this);
	}

	public ArrayList<Word> getWordsList() {
		return wordsList;
	}
	public void setWordsList(ArrayList<Word> wordsList) {
		this.wordsList = wordsList;
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
}
