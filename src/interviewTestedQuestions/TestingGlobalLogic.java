package interviewTestedQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingGlobalLogic {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		System.out.println(map.put(3, "ABC"));
		System.out.println(map.put(1, "XYZ"));
		System.out.println(map.put(2, "ABC"));
		System.out.println(map.put(2, "XYZ"));
		
		
		
		//Sort Map based on value
		
		Map<Integer, String> linkedHashMap = map.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(linkedHashMap);
		
		Map<Integer, String> map2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(map2);
	}
}
