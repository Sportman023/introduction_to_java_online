package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

public class TextFile extends File {
	private String content;
	
	{
		super.setExtension("textFile");
	}
	
	public TextFile(String name) {
		super(name);
		content = "";
	}
	
	public TextFile(String name, String content) {
		super(name);
		this.content = content;
	}
	
	public void addContent (String newContent) {
		content += newContent;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
