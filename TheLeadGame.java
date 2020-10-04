import java.util.Scanner;

public class TheLeadGame {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases = obj.nextInt();
		for(int i=1;i<=test_cases;i++) {
			int value_1, value_2, diff = 0;
			value_1 = obj.nextInt();
			value_2 = obj.nextInt();
			if(value_1>value_2) {
				diff = value_1 - value_2;
			}
			else {
				diff = value_2 - value_1;
			}
			System.out.println(i+" "+diff);
		}

	}

}
