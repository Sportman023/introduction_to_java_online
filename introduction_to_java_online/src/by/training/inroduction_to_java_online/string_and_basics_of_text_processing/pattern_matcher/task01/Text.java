package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;

public class Text {
	private ArrayList<Paragraph> paragraphs;

	{
		paragraphs = new ArrayList<Paragraph>();
	}

	public ArrayList<Paragraph> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(ArrayList<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public Text() {
	}
}
