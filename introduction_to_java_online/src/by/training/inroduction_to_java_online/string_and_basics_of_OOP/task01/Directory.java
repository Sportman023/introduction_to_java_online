package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

import java.util.ArrayList;

public class Directory {
	ArrayList<File> directory;
	{
		directory = new ArrayList<File>();
	}
	public Directory () {
		
	}
		
	public ArrayList<File> getDirectory() {
		return directory;
	}

	public void setDirectory(ArrayList<File> directory) {
		this.directory = directory;
	}
}
