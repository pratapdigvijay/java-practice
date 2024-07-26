package interviewTestedQuestions;

import java.util.Arrays;
import java.util.Optional;

public class PrintStringPerfios {
	
	public static void main(String[] args) {
		String str = "Welcome to perfios";

		Arrays.stream(str.split(" ")).forEach(s -> System.out.println(s));
		
		Optional<String> optional = Optional.of(str);
		
		System.out.println(optional.get());
		
		Optional<String> optionalEmpty = Optional.empty();
		
		//System.out.println(optionalEmpty.get()); Will throw No Such element exception
		
		System.out.println(optionalEmpty.orElse("No Such value "));
		
		System.out.println(optionalEmpty.orElseGet(() -> "Need value"));
		
	//	System.out.println(optionalEmpty.orElseThrow(() -> new IllegalArgumentException()));
		
		
	//	System.out.println(optionalEmpty.orElseThrow());  will also throw exception by default as NoSuchElementException. Added in java 10 
		
		
		System.out.println(optional.map(v -> "Replaced"));
		
		Optional<String> map = optional.map(v -> "Replaced");
		System.out.println(map.get());
		
		System.out.println(optional.filter( f -> f.isBlank()));
		
		Optional<String> filter = optional.filter( f -> f.equals(str));
		System.out.println(filter.orElse("No value"));
		
		optional.ifPresent(System.out::println);
		optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("No Value is there "));
		
		
		optional.stream().forEach(System.out:: println);
		
		optionalEmpty.stream().forEach(System.out:: print);
		
		optionalEmpty.or(() -> Optional.ofNullable("Nullable")).ifPresent(System.out:: print);
	}
}
