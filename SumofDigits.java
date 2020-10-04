import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		int n,x;
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for(int i=0;i<n;i++) {
			int sum = 0;
			x = obj.nextInt();
			while(x!=0) {
				sum = sum + x % 10; 
				x = x/10;
			}	
			System.out.println(sum);
		}
		//System.out.println(sum);
	}

}
