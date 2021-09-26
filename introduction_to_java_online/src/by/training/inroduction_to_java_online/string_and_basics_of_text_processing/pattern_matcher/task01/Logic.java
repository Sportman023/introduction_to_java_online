package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

	public void generateText(Text text, String string) {
		String regex = ".+\\n?";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);

		String paragraphText;
		while (matcher.find()) {
			paragraphText = matcher.group();
			generateSentence(new Paragraph(text), paragraphText);
		}
	}

	private void generateSentence(Paragraph paragraph, String paragraphText) {
		String regex = "[^.!?]+[.!?]{1,3} ?";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(paragraphText);

		String sentenceText;

		while (matcher.find()) {
			sentenceText = matcher.group();
			generateWord(new Sentence(paragraph, sentenceText), sentenceText);

		}
	}

	private void generateWord(Sentence sentence, String sentenceText) {
		String regex = "[-'_A-Za-z]{2,}|\\w+";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sentenceText);
		String wordString = "";

		while (matcher.find()) {
			wordString = matcher.group();
			new Word(sentence, wordString);
		}
	}

	public void sortParagraphsByNumberOfSentences(Text text) {
		ArrayList<Paragraph> paragraphs;
		paragraphs = text.getParagraphs();

		Collections.sort(paragraphs);
	}

	public void sortWordsByLength(Text text) {
		ArrayList<Paragraph> paragraphs;
		ArrayList<Sentence> sentences;
		ArrayList<Word> words;

		paragraphs = text.getParagraphs();

		for (Paragraph paragraph : paragraphs) {
			sentences = paragraph.getSentences();
			for (Sentence sentence : sentences) {
				words = sentence.getWords();
				Collections.sort(words);

				sentence.setWords(words);
				updateSentenceText(sentence);
			}
		}
	}

	public void sortWordsByAmountOfAskedChar(Text text, char ch) {
		ArrayList<Paragraph> paragraphs = text.getParagraphs();
		ArrayList<Sentence> sentences;
		ArrayList<Word> words;
		ArrayList<Word> tempWords;
		ArrayList<String> listWordsAsString;
		ArrayList<Integer> arrayOfInt;

		for (Paragraph paragraph : paragraphs) {
			sentences = paragraph.getSentences();

			for (Sentence sentence : sentences) {
				words = sentence.getWords();
				listWordsAsString = new ArrayList<String>();
				for (Word word : words) {
					listWordsAsString.add(word.getWordText().toLowerCase());
				}
				Collections.sort(listWordsAsString);

				tempWords = new ArrayList<Word>();

				for (int i = 0; i < listWordsAsString.size(); i++) {
					String str = listWordsAsString.get(i);
					for (int j = 0; j < words.size(); j++) {
						if (words.get(j).getWordText().toLowerCase().equals(str)) {
							tempWords.add(words.get(j));
							words.remove(j);
						}
					}
				}
				words = tempWords;
				tempWords = new ArrayList<Word>();

				arrayOfInt = new ArrayList<Integer>();

				for (Word word : words) {
					Integer numberOfIccurences = 0;
					numberOfIccurences = countOccurences(word.getWordText(), ch);
					arrayOfInt.add(numberOfIccurences);
				}

				arrayOfInt.sort(null);

				for (int i = arrayOfInt.size() - 1; i >= 0; i--) {
					int tempInt = arrayOfInt.get(i);
					for (int j = 0; j < words.size(); j++) {
						if ((int) countOccurences(words.get(j).getWordText(), ch) == tempInt) {
							tempWords.add(words.get(j));
							words.remove(j);
						}
					}
				}

				words = tempWords;
				sentence.setWords(words);
				updateSentenceText(sentence);
			}
		}
	}

	private void updateSentenceText(Sentence sentence) {
		String updatedSentenceText = "";
		ArrayList<Word> words = sentence.getWords();
		for (Word word : words) {
			updatedSentenceText += word.getWordText() + " ";
		}
		sentence.setSentenceText(updatedSentenceText.strip() + ". ");
	}

	private Integer countOccurences(String string, char ch) {
		Integer count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}