package learningCheck;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface ExampleInterface {
	int randomCalculate(int a, int b);

	default void print(int result) {
		System.out.println(result);
	}
}

public class FunctionalInterfaceCheck {
	public static void main(String[] args) {
		ExampleInterface exampleInterface = (a, b) -> {
			int randomCal = a * b / 20;
			Random random = new Random();
			randomCal = randomCal + random.nextInt(1000);
			return randomCal;
		};

		exampleInterface.print(exampleInterface.randomCalculate(10, 20));

//Type of FI
		// 1.Supplier - abstract method T get(), providing value without taking any
		// inputs ,commonly use for generating values/lazy initialization
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
		int randomValue = randomNumberSupplier.get();
		System.out.println(randomValue);

		// 2.Consumer - void accept(T t),accepts a single input and returns no value or
		// result,used for performing actions on input values, such as printing, saving,
		// or processing
		Consumer<String> printMessage = message -> System.out.println(message);
		printMessage.accept("Hello, World!"); // Prints "Hello, World!"

		// 3.Function - R apply(T t) accepts one argument and produces a result,used for
		// mapping or transforming input to output
		Function<Integer, String> intToString = num -> "Number: " + num;
		String result = intToString.apply(42);
		System.out.println(result);

		// 4.Predicate - boolean test(T t),represents a condition, boolean-valued
		// function that checks a condition on an input,used for filtering or testing
		// elements based on a condition
		Predicate<Integer> isEven = num -> num % 2 == 0;
		boolean result1 = isEven.test(8);
		System.out.println(result1);

		// 5.Unary Operator - T apply(T t),special case of the ***@Function*** interface
		// where
		// the input and output types are the same,used for operations that transform an
		// input into an output of the same type
		UnaryOperator<Integer> square = num -> num * num;
		int result2 = square.apply(5);
		System.out.println(result2);

		// 6.Binary Operator - T apply(T t,T u),special case of the ****@BiFunction
		// interface**** where the two input arguments and the output are of the same
		// type, used for binary operations that combine two inputs into a single result
		BinaryOperator<Integer> add = (a, b) -> a + b;
		int result3 = add.apply(3, 7);
		System.out.println(result3);

	}
}
