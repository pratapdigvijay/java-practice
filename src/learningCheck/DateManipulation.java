package learningCheck;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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
		
		
		String str = "";
		System.out.println(Objects.nonNull(str));
		
		System.out.println(str.isBlank());
	//	System.out.println(str.isEmpty());
	//	System.out.println(str.length());
	}
}
