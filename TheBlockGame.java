import java.util.*; 

public class TheBlockGame{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int testcases;
		testcases = obj.nextInt();
		checkPalindrome(testcases, obj);
	}

	private static void checkPalindrome(int testcases, Scanner obj) {
		int values, remainder, palindrome_values=0;
		for(int i=0;i<testcases;i++) {
			values = obj.nextInt();
			int sample_values = values;
			while(values>0) {
				remainder = values%10;
				palindrome_values = (palindrome_values * 10) + remainder;
				values = values/10;
			}
			String str = (sample_values == palindrome_values)? "wins" : "loses";
			System.out.println(str);
		}
		
	}
}