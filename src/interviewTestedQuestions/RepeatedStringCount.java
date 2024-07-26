package interviewTestedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class RepeatedStringCount {

	public static void main(String[] args) {
		String str1 = "abc edc rfv tyh";
		String str2 = "pmo edc rfv mnl rfv";
		String[] arrStr = new String[0];
		arrStr = Arrays.stream(str1.split(" ")).toArray(String[]::new);

		String[] arrStr2 = Arrays.stream(str2.split(" ")).toArray(String[]::new);

		Map<String, List<Integer>> map = new HashMap<>();

		for (String string : arrStr2) {
			if (Arrays.asList(arrStr).contains(string)) {
				map.putIfAbsent(string, new ArrayList<>());
				map.get(string).add(1);
			}
		}

		for (Entry<String, List<Integer>> entry : map.entrySet()) {

			String key = entry.getKey();
			Optional<Integer> value = entry.getValue().stream().reduce(Integer::sum);
			System.out.println(key + "-" + value.get());
		}
		
	}

}
