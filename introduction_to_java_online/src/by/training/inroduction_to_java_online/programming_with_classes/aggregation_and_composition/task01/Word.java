package by.training.inroduction_to_java_online.programming_with_classes.aggregation_and_composition.task01;

public class Word {
	String value;
	Sentence sentence;

	public Word(Sentence sentence) {
		this.sentence = sentence;
		this.sentence.getWordsList().add(this);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Sentence getSentence() {
		return sentence;
	}

	public void setSentence(Sentence sentence) {
		this.sentence = sentence;
	}
}
