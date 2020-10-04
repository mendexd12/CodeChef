import java.util.Scanner;

public class AdaSchool{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			int x = obj.nextInt();
			int y = obj.nextInt();
			if(x%2==0 && y%2==0)
				System.out.println("YES");
			else if(x%2 == 0 || y%2 ==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}