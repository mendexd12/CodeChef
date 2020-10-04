import java.util.Scanner;

public class PrimalityTest {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int testcases = 0;
		testcases = obj.nextInt();
		getPrime(testcases, obj);
	}
	private static void getPrime(int testcases, Scanner obj) {
		int values, temp;
		boolean isPrime = false;
		for(int i=1;i<=testcases;i++) {
			values = obj.nextInt();
			for(int j=2;j<=(values)/2;++j) {
				temp = values%j;
				if(temp == 0) {
					isPrime = true;
					break;
				}
			}
			if(!isPrime) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
