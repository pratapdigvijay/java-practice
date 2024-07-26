package learningCheck;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsAndStreams {
	public static void main(String[] args) {
		System.out.println(duplicates(List.of("Java", "Spring", "Java", "Boot", "Cloud", "Spring", "Streams")));
		System.out.println(duplicates(Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34)));

		System.out.println(findFirst(List.of("Java", "Spring", "Java", "Boot", "Cloud", "Spring", "Streams")));

		String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);
		s = "Sachin".concat(" Tendulkar");
		System.out.println(s);

		// using string joiner for delimiters
		StringJoiner sj = new StringJoiner("", ":", ":");
		System.out.println(sj.add(s));

		// Another way for finding first element
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().findFirst().ifPresent(System.out::println);
		
		myList.forEach(System.out::println);

		// sorting elements
		myList.stream().sorted().forEach(System.out::print);
		System.out.println();
		System.out.println(findMax(Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15)));

		System.out.println(findMaxSecond(new int[] { 10, 15, 8, 49, 25, 98, 98, 32, 15 }));

		System.out.println(frequencyCount(
				Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil")));
		
        System.out.println(nonRepeating("prepbytes"));
        
        checkAnagram("RaceCar", "CarRace");
        
        String str1 = "one";
        String str2 = "two";
        
        System.out.println(str1.equals(str2=str1));
        
	}

	// find duplicate values
	public static <T> Set<T> duplicates(List<T> list) {
		return list.stream().filter(f -> Collections.frequency(list, f) > 1).collect(Collectors.toSet());

	}

	// find first element
	public static <T> T findFirst(List<T> list) {
		return list.stream().findFirst().get();
	}

	// max values present
	public static Integer findMax(List<Integer> list) {
		return list.stream().min(Integer::compare).get();
	}

	// max values present second way
	public static Integer findMaxSecond(int[] list) {
		return Arrays.stream(list).max().getAsInt();
	}

	// duplicate/frequency of each element in list
	public static <T, R> Map<T, Long> frequencyCount(List<T> list) {
		Map<T, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

	}
	
	//Non repeating character in string
	public static <T> String nonRepeating(String str) {
		List<String> list = Arrays.asList(str.split(""));

		return list.stream().filter(f -> (Collections.frequency(list, f) < 2)).findFirst().get();
	}
	
	//Checking if two strings are anagram
	public static void checkAnagram(String s1, String s2) {
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		if (s1.equals(s2)) {
			System.out.println("Two strings are anagrams");
		} else {
			System.out.println("Two strings are not anagrams");
		}
	}
	
}
