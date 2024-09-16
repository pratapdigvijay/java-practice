package interviewTestedQuestions;

//Persistence System
public class TestingPE {
	
	//aaaaabbbbbccccddeee
	//a5b5c4d2e3
	public static void main(String[] args) {
		
		System.out.println(compressionString("aaaaabbbbbccccddeee"));
	}
		
	public static String compressionString(String str) {

		char[] arr1 = str.toCharArray();
		String c = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j <str.length() ; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
				}
			}
			c = c + arr1[i] + count;
			i = i + count-1;
		}
		return c;
	}
	

}
