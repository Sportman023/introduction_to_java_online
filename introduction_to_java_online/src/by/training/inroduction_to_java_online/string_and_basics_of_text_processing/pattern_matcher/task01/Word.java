package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

public class Word implements Comparable {
	private Sentence sentence;
	private String wordText;

	public Word(Sentence sentence, String wordText) {
		this.sentence = sentence;
		this.wordText = wordText;
		this.sentence.getWords().add(this);
	}

	public Sentence getSentence() {
		return sentence;
	}

	public void setSentence(Sentence sentence) {
		this.sentence = sentence;
	}

	public String getWordText() {
		return wordText;
	}

	public void setWordText(String wordText) {
		this.wordText = wordText;
	}

	@Override
	public int compareTo(Object compareWord) {
		// compare by length of word
		int compareWordLength = ((Word) compareWord).getWordText().length();
		return this.wordText.length() - compareWordLength;
	}
}
