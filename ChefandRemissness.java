import java.util.Scanner;

public class ChefandRemissness {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int a, b;
		int testcases;
		testcases = obj.nextInt();
		for(int i =0;i<testcases;i++) {
			a = obj.nextInt();
			b = obj.nextInt();
			int x = (a>b)?a:b;
			System.out.println(x);
			System.out.println(a+b);
		}
	
	}

}
