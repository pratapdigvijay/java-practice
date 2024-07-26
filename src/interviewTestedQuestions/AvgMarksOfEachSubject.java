package interviewTestedQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AvgMarksOfEachSubject {
	
	public static void main(String[] args) {
		String[] marks = { "1-English: 58", "2-Maths:67", "3-Science:86", "4-English:89", "5-Science:68" };
		calculateAverageMarks(marks);
		
		double a ='2';
		String b = "2";
		System.out.println(a);
		System.out.println(b);
		
		Map<String, List<Double>> map = new HashMap<>();

		for (String mark : marks) {
			String[] parts = mark.split(":");
			String sub = parts[0].split("-")[1]; // Extract the subject
			double number = Double.valueOf(parts[1]); // Extract the number

			// Add the marks to the corresponding subject in the map
			map.putIfAbsent(sub, new ArrayList<>());
			map.get(sub).add(number);
		}

		// calculate average for each subject
		for (Entry<String, List<Double>> entry : map.entrySet()) {
			String subject = entry.getKey();
			double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
			System.out.println("The average marks for the subject " + subject + " is " + average);

		}
	}
	
	//Second way to get the average marks 
    public static void calculateAverageMarks(String[] data) {
        Map<String, int[]> marksMap = new HashMap<>();

        for (String entry : data) {
            String[] parts = entry.split(":");
            String subjectPart = parts[0].substring(parts[0].indexOf('-') + 1);
            String subject = subjectPart.trim();
            int marks = Integer.parseInt(parts[1].trim());

            marksMap.putIfAbsent(subject, new int[2]);
            marksMap.get(subject)[0] += marks; // total marks
            marksMap.get(subject)[1] += 1; // count of entries
        }

        for (Map.Entry<String, int[]> entry : marksMap.entrySet()) {
            String subject = entry.getKey();
            int totalMarks = entry.getValue()[0];
            int count = entry.getValue()[1];
            double average = (double) totalMarks / count;
            System.out.println("Average marks in " + subject + ": " + average);
        }
    }
}
