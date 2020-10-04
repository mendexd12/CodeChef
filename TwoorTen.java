import java.util.Scanner;

public class TwoorTen {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test, tests;
		test = obj.nextInt();
		for(int i=0;i<test;i++) {
			tests = obj.nextInt();
			int x = tests%10;
			if(x==0) {
				System.out.println("0");
			}
			else if(x==5) {
				System.out.println("1");
			}
			else {
				System.out.println("-1");
			}
		}
	}

}
