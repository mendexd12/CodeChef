import java.util.Scanner;

public class SqrtRoot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x, n;
		double ans=0;
		x = obj.nextInt();
		for(int i = 0;i<x;i++) {
			n = obj.nextInt();
			ans = (double)Math.sqrt(n);
			System.out.println((int)Math.floor(ans));
		}
	}
}
