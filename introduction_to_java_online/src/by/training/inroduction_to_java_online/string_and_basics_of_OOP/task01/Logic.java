package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

import java.util.ArrayList;

public class Logic {
	private Directory directory;
	ArrayList<File> drList;
	
	public Logic (Directory directory) {
		this.directory = directory;
		drList = this.directory.getDirectory();
	}
	
	public void createTextFile (String name) {
		TextFile textFile = new TextFile(name);
		
		if (getFileByName(name, textFile.getExtension()) == null) {
			drList.add(new TextFile(name));
		} else {
			System.out.println("File " + name + " already exist!");
		}
	}
	
	public void createTextFile (String name, String content) {
		TextFile textFile = new TextFile(name);
		if (getFileByName(name, textFile.getExtension()) == null) {
			drList.add(new TextFile(name, content));
		} else {
			System.out.println("File " + name + " already exist!");
		}
	}
	
	public void deleteFile (String name, String extension) {
		File file;
		if (getFileByName(name, extension) == null) {
			System.out.println("File " + name + "." + extension + " is not found");
		} else {
			file = getFileByName(name, extension);
			drList.remove(file);
		}
	}
	
	public void rename (String oldName, String newName, String extension) {
		File file;
		
		file = getFileByName(oldName, extension);
		
		if (file == null) {
			System.out.println("File " + oldName + "." + extension + " is not found");
		} else if (getFileByName(newName, extension) != null){
			System.out.println("File " + newName + "." + extension + " already exist!");
		} else {
			file.setName(newName);
		}
	}
		
	public void addContent (String name, String extension, String newContent) {
		TextFile file;
		
		file = (TextFile)getFileByName(name, extension);
		
		if (file == null) {
			System.out.println("File " + name + "." + extension + " is not found");
		} else {
			file.addContent(newContent);
		}
	}
	
	public File getFileByName(String name, String extension) {
		
		for (File file : drList) {
			if(file.getName().equals(name) && file.getExtension().equals(extension)) {
				return file;
			}
		}
		return null;
	}
}
