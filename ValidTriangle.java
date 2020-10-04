import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int testcases, x,y,z, tot=0;
		testcases = obj.nextInt();
		for(int i =0;i<testcases;i++) {
			x = obj.nextInt();
			y = obj.nextInt();
			z = obj.nextInt();
			tot = x+y+z;
			String str = (tot == 180)? "Yes":"No";
			System.out.println(str.toUpperCase());
		}
	}

}
