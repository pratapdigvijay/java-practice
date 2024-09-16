package interviewTestedQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestingWipro {

	public static void main(String[] args) {

		System.out.println(checkException());
		
		if(true) {
		//	break;  compilation error
		}
		
		System.out.println(removeRepeatingChar("RepeatteddStrring"));
		
		int[] arr = {1,2,3,4};
	//	arr[4]=5;   ArrayIndexOutOfBoundException
		System.out.println(Arrays.toString(arr));
	}

	static int checkException() {

		try {
			int number = 10 / 0;
			System.exit(1);
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	static String removeRepeatingChar(String str) {
		return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
	}
}
