import java.util.Scanner;

public class GcdandLcd{
	public static void main(String[] args) {
		int test_cases, x, y;
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			x = obj.nextInt();
			y = obj.nextInt();
			int gcd = 1;
			for(int j=1;j<=x && j<=y;j++) {
				if(x%j == 0 && y%j == 0) {
					gcd = j;
				}
			}
			int lcm = (x*y)/gcd;
			System.out.println(gcd+" "+lcm);
		}
		
	}
}