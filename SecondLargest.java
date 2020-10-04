import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = obj.nextInt();
			if((a>b && b>c) || (c>b && b>a)){
				System.out.println(b);
			}
			else if((c>a && a>b)||(b>a && a>c)){
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
	}

}
