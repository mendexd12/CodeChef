import java.util.Scanner;

public class Ciel {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int ans = 0, a, b;
		a = obj.nextInt();
		b = obj.nextInt();
		ans = a - b;
		if(ans == 9)
			ans = ans - 1;
		else
			ans = ans + 1;
		
		System.out.println(ans);
	}
	

}
