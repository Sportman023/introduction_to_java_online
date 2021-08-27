package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;

public class Paragraph implements Comparable {
	private ArrayList<Sentence> sentences;
	private Text text;
	
	{
		sentences = new ArrayList<Sentence>();
	}
	public Paragraph(Text text){
		this.text = text;
		this.text.getParagraphs().add(this);
	}
	public ArrayList<Sentence> getSentences() {
		return sentences;
	}
	public void setSentences(ArrayList<Sentence> sentences) {
		this.sentences = sentences;
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	@Override
	public int compareTo(Object compareParagraph) {
		// compare by number of sentence
		int compareSentencesNumber = ((Paragraph) compareParagraph).getSentences().size();
		return this.sentences.size() - compareSentencesNumber;
	}	
}
