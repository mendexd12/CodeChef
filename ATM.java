import java.util.Scanner;

public class ATM{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int withdraw;
		double balance, x = 0;
		withdraw = obj.nextInt();
		balance = obj.nextDouble();
		if(withdraw%5==0 && (withdraw+0.5)<balance) {
			x = balance - (withdraw + 0.5);
			System.out.println(x);
		}else {
			System.out.println(balance);
		}
	}
}