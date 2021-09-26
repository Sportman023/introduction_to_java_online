package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

public abstract class File {
	private String name;
	private String extension;
	
	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}