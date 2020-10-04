import java.util.Scanner;

public class SmallFactorials {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		short x = obj.nextShort();
		for(int i=0;i<x;i++) {
			short y = obj.nextShort();
			short sum=1;
			for(int j=1;j<y;j++) {
				sum += sum*j;
			}
			System.out.println(sum);
		}
		obj.close();
	}
}
