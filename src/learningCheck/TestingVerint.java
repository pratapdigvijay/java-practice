package learningCheck;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestingVerint {

	
	public static int findIndexOfMax(int[] values) {

		int temp =0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > values[temp]) {
				temp = i;
			}
		}

		return temp;
	}
	    public static void main(String[] args) {
	        int[] values = {0, 0, 0, 0, -1};
	        int idx = findIndexOfMax(values);
	        int index = findIndexOfMaxUsingStreams(values);
	        System.out.println(idx);
	        System.out.println(index);
	    }
	
		public static int findIndexOfMaxUsingStreams(int[] values) {
			int maxValue = IntStream.of(values).max().getAsInt();
			return Arrays.stream(values).boxed().collect(Collectors.toList()).indexOf(maxValue);
		}
}
