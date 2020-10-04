import java.util.Scanner;

public class FirstandLast {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int first = 0, last, sum = 0;
		int m = obj.nextInt();
		for(int i =0;i<m;i++) {
			int x;
			x = obj.nextInt();
			
			first = x;
			while(first>=10) {
				first = first/10;
			}
			last = x%10;
			sum = first + last;
			System.out.println(sum);
		}
		obj.close();
		//System.out.println(first);
	}

}
