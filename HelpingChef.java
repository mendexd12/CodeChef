import java.util.Scanner;

public class HelpingChef {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases;
		test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			int x =obj.nextInt();
			String str = (x<10)? "Thanks for helping Chef!" : "-1";
			System.out.println(str);
		}

	}

}
