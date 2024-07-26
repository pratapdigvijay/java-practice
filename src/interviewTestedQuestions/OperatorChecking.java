package interviewTestedQuestions;

public class OperatorChecking {
	public static void main(String[] args) {
		//without assignment will throw compilation error
		// 5>6 ? 6:5;
		
		int result =5>6 ? 6:5;
		
		//here it will not throw error
		System.out.println(5>6 ? 6:5);
	}
	
}
