package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;

public class Sentence {
	private ArrayList<Word> words;
	private Paragraph paragraph;
	private String sentenceText;

	{
		words = new ArrayList<Word>();
	}

	public Sentence(Paragraph paragraph, String sentenceText) {
		this.paragraph = paragraph;
		this.paragraph.getSentences().add(this);
		this.sentenceText = sentenceText;
	}

	public String getSentenceText() {
		return sentenceText;
	}

	public void setSentenceText(String sentenceText) {
		this.sentenceText = sentenceText;
	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}

	public Paragraph getParagraph() {
		return paragraph;
	}

	public void setParagraph(Paragraph paragraph) {
		this.paragraph = paragraph;
	}
}
