package by.training.inroduction_to_java_online.string_and_basics_of_OOP.task01;

public class Main {

	public static void main(String[] args) {
		Directory dr = new Directory();
		Logic logic = new Logic(dr);
		View view = new View(dr, logic);
		
		logic.createTextFile("File1", "Content 1");
		logic.createTextFile("File2", "Content 2");
		logic.createTextFile("File3", "Content 3");
		
		System.out.println("List of files:\n");
		view.printNames();
		System.out.println();
		
		System.out.println("Rename \"File1\" to \"File12\"\n");
		logic.rename("File1", "File12", "textFile");

		System.out.println("List of files:\n");
		view.printNames();
		System.out.println();
				
		System.out.println("Content of \"File3\"");
		view.PrintContent("File3", "textFile");
		
		System.out.println("Add \" + new content\" to content of \"File3\":\n");
		logic.addContent("File3", "textFile", " + new content");

		System.out.println("New content of \"File3\":\n");
		view.PrintContent("File3", "textFile");
		
		System.out.println("Delete \"File3\"");
		logic.deleteFile("File3", "textFile");
		System.out.println("List of files:\n");
		view.printNames();
	}

}
