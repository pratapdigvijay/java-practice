package learningCheck;

interface Floatable {
    default void repair() {
    	System.out.println("Repairing Floatable object");	
    }
}
interface Flyable {
     default void repair() {
    	System.out.println("Repairing Flyable object");	
    }
}
public class InheritanceExamples implements Flyable,Floatable {
	
	@Override
	public void repair() {
		Floatable.super.repair(); // if dont write this line, then method will not print anything and will run fine.
	}
	public static void main(String[] args) {
		InheritanceExamples examples = new InheritanceExamples();
		examples.repair();
	}

}
