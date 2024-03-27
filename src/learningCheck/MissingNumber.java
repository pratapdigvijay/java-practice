package learningCheck;

import java.util.Arrays;

public class MissingNumber {

	static int missingNumber(int array[], int n) {
		// Your Code Here
		Arrays.sort(array);
		for (int i = 0; i < n - 1; i++) {
			if (!(array[i] == i + 1))
				return i + 1;
		}
		return n;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5 };
		System.out.println(missingNumber(array, 5));
	}

	static int missingNumber1(int array[], int n) {
		// variable to store the sum of numbers from 1 to n
		int total;
		// calculating the sum using the formula
		total = (n + 1) * (n) / 2;
		// subtracting each number in the array from the total
		for (int i = 0; i < n - 1; i++)
			total -= array[i];
		// returning the missing number
		return total;
	}
}
