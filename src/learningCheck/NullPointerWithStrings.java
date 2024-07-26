package learningCheck;

public class NullPointerWithStrings {
	
	public static void main(String[] args) {
		
		String str = "check";
		
		String check = null;
		
		String newStr = str.concat(check); //Null POinter Exception here as it cannot invoke "String.isEmpty()
		
	}
	
}
