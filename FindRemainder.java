 import java.util.Scanner;

public class FindRemainder {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x, a, b,ans;
		x = obj.nextInt();
		for(int i=0;i<x;i++) {
			a=obj.nextInt();
			b=obj.nextInt();
			ans = a%b;
			System.out.println(ans);
		}
		obj.close();
		//System.out.println(ans);
	}
}
