package learningCheck;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringManipulation {

	public static void main(String[] args) {
		

		// changing only first character as uppercase and utilizing Stream function
		String output1 = Stream.of("my", "name", "is", "", "", "goonsolvis", "anthony", "", "", "")
				.filter(str -> !str.isEmpty())

				.map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1)).sorted()
				.collect(Collectors.joining("-"));

		// changing all the strings to uppercase
		List<String> list = List.of("my", "name", "is", "", "", "goonsolvis", "anthony", "", "", "");
		String output2 = list.stream().filter(Predicate.not(String::isEmpty)).sorted().map(m -> m.toUpperCase())
				.collect(Collectors.joining(" "));
		System.out.println(output1);
		System.out.println(output2);
		
		//beginIndex should not larger than length of this String object.
		System.out.println("empitness".substring(9));
		
		//Removing digits from string
		String input = "ABCD123EFG";
		  String output ="";
		  char[] arr = new char[input.length()];
	        for(int i =0; i<input.length();i++){
	            if(!Character.isDigit(input.charAt(i))) {
	                output += input.charAt(i);
	            	arr[i]= input.charAt(i);
	            }
	        }
	        System.out.println(output);
	        System.out.println(String.valueOf(arr));
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i=0 ;i<arr.length;i++) {
	        	if(!Character.isWhitespace(arr[i]))
	        	sb.append(arr[i]);
	        }
	        System.out.println(sb);
	        //Using regex to replace digits
	        System.out.println(input.replaceAll("\\d", ""));
	        
	}

}
