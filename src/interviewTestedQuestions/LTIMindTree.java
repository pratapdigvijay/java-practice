package interviewTestedQuestions;

public class LTIMindTree {
	
	public static void main(String[] args) {

		for (int j = 5; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int i = 4321;
		int ans = 0;

		while (i > 0) {
			ans = ans*10 + i%10;
			
			i = i/10;
		} 
		
		System.out.println(ans);
	}
}
