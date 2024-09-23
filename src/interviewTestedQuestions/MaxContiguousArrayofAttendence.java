package interviewTestedQuestions;

public class MaxContiguousArrayofAttendence {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10 };

		int max = 0;
		int idx = 0;
		int count = 0;
		int res = 0;
		int start = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 6) {
				idx = i;
				count = 1;
				i++;
				while (arr[i] > 6) {
					count++;
					if(i+1 >= arr.length)
						break;
					i++;
				}

			}

			if (count > res) {
				max = i;
				res = count;
				start = idx;
			}
		}

		for (int i = start; i <= max; i++) {
			System.out.print(arr[i]);
		}
	}
}
