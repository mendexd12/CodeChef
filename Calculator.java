import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		double x = obj.nextDouble();
		double y = obj.nextDouble();
		char str = obj.next().charAt(0);
		if(str == '+') {
			System.out.println(x+y);
		}
		else if(str == '-') {
			System.out.println(x-y);
		}
		else if(str == '*') {
			System.out.println(x*y);
		}
		else {
			System.out.println(x/y);
		}

	}

}
