import java.util.Scanner;

public class InTest {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		getDivisibleInts(x, y, obj);

	}

	private static void getDivisibleInts(int x, int y, Scanner obj) {
		int values;
		int count =0;
		for(int i=0;i<x;i++) {
			values = obj.nextInt();
			if(values%y==0)
				count++;
		}
		System.out.println(count);
	}

}
