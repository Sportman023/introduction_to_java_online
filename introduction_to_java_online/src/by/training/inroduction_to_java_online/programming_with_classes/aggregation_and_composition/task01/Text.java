package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task01;

import java.util.ArrayList;

public class Text {

	private ArrayList<Sentence> sentencesList;
	private String title;

	{
		sentencesList = new ArrayList<Sentence>();
	}

	public Text() {

	}

	public ArrayList<Sentence> getSentencesList() {
		return sentencesList;
	}

	public void setSentencesList(ArrayList<Sentence> sentencesList) {
		this.sentencesList = sentencesList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
