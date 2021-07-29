package programming_with_classes.simple_classes_and_objects.aggregation_and_composition.task02;

public class View {
	public View() {
		
	}
	
	public void drive(boolean readiness) {
		if (readiness) {
			System.out.println("I'm driving....");
		} else {
			System.out.println("Somethig went wrong. I can't drive.");
		}
		
		
	}
}
