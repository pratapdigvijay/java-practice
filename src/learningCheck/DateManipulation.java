package learningCheck;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateManipulation {
	public static void main(String[] args) {
		long millis= System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println(date);
		
		String format = new SimpleDateFormat("yyy-MM-dd").format(date);
		System.out.println(format);
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		System.out.println(format.equals(date2.toString()));
		
	}
}
