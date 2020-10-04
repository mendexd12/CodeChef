import java.util.Scanner;

public class SumorDiff {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x, y;
		x = obj.nextInt();
		y = obj.nextInt();
		SumorDiff sd = new SumorDiff();
		sd.getResult(x,y);	
	}

	public void getResult(int x, int y) {
		if(x>y) {
			System.out.println(x-y);
		}
		else {
			System.out.println(x+y);
		}
	}

}
