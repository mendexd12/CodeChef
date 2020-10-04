import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases;
		test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			int quantity, price;
			double tot;
			quantity = obj.nextInt();
			price = obj.nextInt();
			if(quantity>1000) {
				double discount = quantity * price;
				tot = discount - 0.10 * discount;
			}
			else {
				tot = quantity * price;
			}
			System.out.println(tot);
		}
	}

}
