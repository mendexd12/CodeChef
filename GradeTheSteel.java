import java.util.Scanner;

public class GradeTheSteel {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases;
		test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			int h, st;
			h = obj.nextInt();
			double cc = obj.nextDouble();
			st = obj.nextInt();
			if(h>50 && cc<0.7 && st>5600 ) {
				System.out.println("10");
			}
			else if(h>50 && cc<0.7) {
				System.out.println("9");
			}
			else if(cc<0.7 && st>5600) {
				System.out.println("8");
			}
			else if(h>50 && st>5600 ) {
				System.out.println("7");
			}
			else if(h>50 || st>5600 || cc<0.7) {
				System.out.println("6");
			}
			else {
				System.out.println("5");
			}
		}
	}
}
