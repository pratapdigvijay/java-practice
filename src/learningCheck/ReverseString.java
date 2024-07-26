package learningCheck;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(method1("Checking"));
		System.out.println(method2("Checking"));
		method3("Checking");

		System.out.println("\n" + Runtime.getRuntime());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());

		System.gc();
		System.out.println("After garbage collector runs");
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
	}

	public static String method1(String str) {
		char c;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			c = str.charAt(i);
			reverse += c;
		}
		return reverse;
	}

	public static String method2(String str) {
		char[] arr = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		
		while (i <= j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(arr);
	}

	public static void method3(String str) {
		char[] try1 = str.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
