import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x, a = 0, b = 0, ans=0;
		x = obj.nextInt();
		for(int i=0;i<x;i++) {
			a = obj.nextInt();
			b = obj.nextInt();
			System.out.println();
			ans = a+b;
			System.out.print(ans);
		}
		obj.close();
	}
}
