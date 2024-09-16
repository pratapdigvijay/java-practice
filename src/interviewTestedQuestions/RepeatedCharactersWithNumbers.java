package interviewTestedQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharactersWithNumbers {

	// duplicate/frequency of each element in list
		public static <T> Map<Object, Object> frequencyCount(List<T> list) {
			Map<T, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			System.out.println(map);
			
			
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//return null;
		}
	
	public static void main(String[] args) {
		
		String str = "aabbcccaaa";
		for(int i = 0, count = 1; i < str.length(); i++, count++) {
		    char ch = str.charAt(i);
		    char next = i + 1 < str.length() ? str.charAt(i + 1) : (char) -1;
		    if (ch != next) {
		       System.out.print("" + ch + count);
		       count = 0;
		    }
		}
		System.out.println();
//		
//		int next = 33 ;
//		int next2= '0';
//		char c = (char)next;
		System.out.println(Character.isDigit(9));

		int count = 1;
		for(int i = 0; i <str.length();i=i+count){
		    count =1;
		    for(int j = i+1; j<str.length();j++){
		        if(str.charAt(i) == str.charAt(j)){
		            count = count+1;
		        }
		        else{
		             break;
		        }
		    }
		    // Print here otherwise you will miss the last group of letters
		    // Also if you just want one line use .print instead of println
		    System.out.print(str.charAt(i)+""+count);
		}
		
		System.out.println();
		
		System.out.println(frequencyCount(Arrays.asList(str.split(""))));
		
	}
}

