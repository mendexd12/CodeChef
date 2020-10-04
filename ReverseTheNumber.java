import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int testcases, values, result = 0;
		testcases = obj.nextInt();
		for(int i =0;i<testcases;i++) {
			values = obj.nextInt();
			while(values>0) {
				result = values%10 + result * 10;
				values = values/10;
			}
			System.out.println(result);
		}

	}

}
