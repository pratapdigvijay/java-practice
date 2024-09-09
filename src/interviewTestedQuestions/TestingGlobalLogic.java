package interviewTestedQuestions;

import java.util.HashMap;
import java.util.Map;

public class TestingGlobalLogic {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		System.out.println(map.put(1, "ABC"));
		System.out.println(map.put(1, "XYZ"));
		System.out.println(map.put(2, "ABC"));
	}
}
