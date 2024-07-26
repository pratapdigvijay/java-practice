package learningCheck;

enum Color {

	RED, GREEN, BLUE;
}

public class EnumTest {
	public static void main(String[] args) {
		// Calling values()
		Color arr[] = Color.values();

		// enum with loop
		for (Color col : arr) {
			// Calling ordinal() to find index
			// of color.
			System.out.println(col + " at index " + col.ordinal());
		}

		// Using valueOf(). Returns an object of
		// Color with given constant.
		
		System.out.println(Color.valueOf("RED"));
		// Below line causes exception
		// IllegalArgumentException
	//	System.out.println(Color.valueOf("WHITE"));
		String str  = "100.2010";
		System.out.println(Double.parseDouble(str));
		System.out.println(Double.valueOf(str));
	}
}