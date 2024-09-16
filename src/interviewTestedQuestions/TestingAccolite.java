package interviewTestedQuestions;

public class TestingAccolite {

	
//	write a java program to find the closest value to the given number in a sorted integers.
//
//	Array may contain duplicate values and negative numbers. 
//
//	Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}
//
//	             Target number = 11
//
//	Output : 9
//
//	9 is closest to 11 in given array
//
//	Input :arr[] = {2, 5, 6, 7, 8, 8, 9}; 
//
//	       Target number = 4
	
	public static void main(String[] args) {
		
		int arr[] = {-2,-3, 5, 6, 7, 8, 8, 9};
		int targetNumebr =4;
		
		int res = arr[0];
		  
	    // Traverse the array
	    for(int i = 1; i < arr.length; i++) 
		{

			if (Math.abs(targetNumebr - res) > Math.abs(targetNumebr - arr[i])) {
				res = arr[i];
			}
		}
	  
		System.out.println(res);
	}

}
