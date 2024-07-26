package learningCheck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoreOnStrings {
	
	public static void main(String[] args) {
		String str = "hello";
		
		str = str.toUpperCase();
		System.out.println(str);
		str = "The quick brown fox jumps over the lazy dog";
		checkPangram(str);
		
		byte x = 127;
		x++;
		System.out.println(x);
		
		x++;
		System.out.println(x);
		
		testingStringWithSplit(str);
	}
	
	//check if the given string is pangram
	public static void checkPangram(String str) {
		Set<Character> charSet = new HashSet<>();
		str = str.toLowerCase();
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)>= 'a' && str.charAt(i) <='z') {
				charSet.add(str.charAt(i));
			}
		}
		
		System.out.println(charSet.size() == 26 ? "it is pangram" : "not a pangram");
	}
	
	public static void testingStringWithSplit(String str) {
		String[] descArray = new String[0];
	//	descArray[0]="The";
	//	descArray[1]="quick"; java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		descArray= Arrays.stream(str.split("(?<=\\G.{10})")).toArray(String[]::new);
	//	descArray = Arrays.stream(str.split(",")).toArray(String[]::new);
		
		boolean anyMatch = Arrays.stream(descArray).anyMatch(s -> s.contains("quick"));
		//Another way to write above expression
	//	boolean anyMatch = Arrays.stream(descArray).anyMatch("quick"::equals);
		System.out.println(anyMatch);
	}	
}
