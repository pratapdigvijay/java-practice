package interviewTestedQuestions;

import java.util.Arrays;

//DTICI interview
public class TestingAnagram {
	
	public static void main(String[] args) {
		String a = "RaceCar";

		String b = "Carrace";

		char[] arr1 = a.toUpperCase().toCharArray();

		char[] arr2 = b.toUpperCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (arr1[i] == arr2[i]) {
					continue;
				} else {
					count++;
				}
			}

		} else {
			count++;
		}

		if (count > 0) {
			System.out.println("Not anagram");

		} else {
			System.out.println("anagram");
		}
		
		
		//Another simple way to check 
		System.out.println(Arrays.equals(arr1, arr2) ?"anagram" : "Not anagram" );
		
	}
		
	
	 
}
