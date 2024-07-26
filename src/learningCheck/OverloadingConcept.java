package learningCheck;

public class OverloadingConcept {

	public static void main(String[] args) {
		print(null);
		
		final StringBuffer buffer = new StringBuffer("immutable");
		System.out.println(buffer);
		
		//this we can not do now as it is final
//		buffer =  new StringBuffer("immutable");
		final String str = "str";
		
		//same here , again we can not re assign
		//str = "new str";
	}

	public static void print(Object obj) {
		System.out.println("Object");
	}

	public static void print(String str) {
		System.out.println("String");
	}
}
