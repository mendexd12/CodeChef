import java.util.Scanner;

public class ChefandOperators {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x = 0, y,testcases;
		testcases = obj.nextInt();
		for(int i=0;i<testcases;i++) {
			x = obj.nextInt();
			y = obj.nextInt();
			if(x>y) {
				System.out.println(">");
			}else if(x<y) {
				System.out.println("<");
			}else {
				System.out.println("=");
			}
		}
	}
}
