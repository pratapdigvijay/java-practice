package learningCheck;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckingFunctionsInStream {
	public static void main(String[] args) throws IOException {
		String filePath = "C:/Users/digvisingh/Downloads/Resume.txt";

		Stream<String> lines = Files.lines(Paths.get(filePath));

		Set<String> distinctWords = lines
		  .flatMap(line -> Arrays.stream(line.split("\\s+")))
		  .collect(Collectors.toSet());
		
		lines.close();
		System.out.println("Distinct words in the file: " + distinctWords);
	}
}
