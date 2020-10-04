import java.util.Scanner;

public class DecrementOrIncrement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x;
		x = obj.nextInt();
		getInDec(x);

	}

	private static void getInDec(int x) {
		if(x%4==0) {
			x++;
		}
		else {
			x--;
		}
		System.out.println(x);
	}
}
