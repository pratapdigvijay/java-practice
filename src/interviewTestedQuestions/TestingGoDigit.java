package interviewTestedQuestions;

import java.util.Collections;
import java.util.List;

public class TestingGoDigit {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(2,1,2,4,1,2,3,2);
		
		System.out.println(list.stream().filter(f -> Collections.frequency(list, f)<2).toList());
	}

}
