package learningCheck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumbersAndStreams {
	public static void main(String[] args) {

		System.out.println(sumOfDigits(12345));
		findCommonElement();
		System.out.println(Arrays.toString(reverseArrayValues(new int[] { 5, 1, 7, 3, 9, 6 })));
		getFibonacciSeries();

		// List<String> strings = Arrays.<Object>asList("hi there"); Can not be equal as
		System.out.println();

		// Array declaration of Object type --- Need to understand that here we can add
		// all subtype of values
		Object[] obj = { 1, 2.0f, "Student", true , new NumbersAndStreams()};
		for (Object val : obj) {
			System.out.println(val + " is part of " + val.getClass().getSimpleName());
		}
		Object val= obj[0];
		 if (val instanceof Integer) {
			Integer str = (Integer) val;
			System.out.println(str + " new value");
		}
		System.out.println(Arrays.toString(obj));
		
		System.out.println(primitiveToListConversion(new int[] { 5, 1, 7, 3, 9, 6 } ));
	}

	// sum of digits in a number
	public static Integer sumOfDigits(int number) {
		return Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
	}

	public static void findCommonElement() {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(list2::contains).forEach(System.out::println);
	}

	// reversing Array
	public static int[] reverseArrayValues(int[] arr) {

		return IntStream.rangeClosed(1, arr.length).map(m -> arr[arr.length - m]).toArray();
	}

	// fibonacci series
	public static void getFibonacciSeries() {
		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
				.forEach(i -> System.out.print(i + " "));
	}

	// finding duplicates
	public static Set<Integer> findDuplicates(List<Integer> list) {

		return list.stream().filter(f -> (Collections.frequency(list, f) > 1)).collect(Collectors.toSet());
	}
	
	//Conversion of primitive array to list
	public static List<Integer> primitiveToListConversion(int[] numArray) {
		return Arrays.stream(numArray).boxed().collect(Collectors.toList());
	}
	
	//JointPrimitiveArray
	public static int[] joinArray(int[] input1, int[] input2, int[] input3) {
		return input3;
		
	}
}
