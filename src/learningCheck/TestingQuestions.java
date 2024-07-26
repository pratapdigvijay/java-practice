package learningCheck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestingQuestions {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		// compilation will fail
//		System.out.println(Collections.unmodifiableList(myList).remove(0));
		
		try {
			System.out.println(Collections.unmodifiableList(myList).remove(0));
		} catch (Exception e) {
			
			// which one print the message for exception
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	//	System.out.println(Integer.parseInt("123abc"));  // Will throw Number Format Exception
	}
}

class Singleton {
	private static volatile Singleton singleton;

	private Singleton() {
	}

	public Singleton getInstance() {
		if (singleton == null) {
			synchronized (singleton) {
				if (singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}

final class Immutable {
	private final int var;

	public Immutable(int var) {
		this.var = var;
	}

	public int getVariable() {
		return this.var;
	}

}
