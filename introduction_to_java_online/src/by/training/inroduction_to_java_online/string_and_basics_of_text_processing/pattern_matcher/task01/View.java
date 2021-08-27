package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;

public class View {
	public View () {
		
	}
	public void printText(Text text) {
		ArrayList<Paragraph> paragraphs = text.getParagraphs();
		ArrayList<Sentence> sentences;
		
		for (Paragraph paragraph : paragraphs) {
			sentences = paragraph.getSentences();
			
			for (Sentence sentence : sentences) {
				System.out.print(sentence.getSentenceText());
			}
			System.out.println();
		}
	}
}
