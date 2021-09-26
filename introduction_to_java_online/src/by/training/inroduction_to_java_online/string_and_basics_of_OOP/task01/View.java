package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

import java.util.ArrayList;

public class View {
	
	private Directory directory;
	private ArrayList<File> drList;
	private Logic logic;
	
	public View (Directory directory, Logic logic) {
		this.directory = directory;
		drList = this.directory.getDirectory();
		this.logic = logic;
	}

	public void PrintContent (String name, String extension) {
		TextFile file;
		
		file = (TextFile)logic.getFileByName(name, extension);
		
		if (file == null) {
			System.out.println("File " + name + "." + extension + " is not found");
		} else {
			System.out.println(file.getContent());;
		}
	}
	
	public void printNames () {
		for (File file : drList) {
			System.out.println(file.getName() + "." + file.getExtension());
		}
	}

}
