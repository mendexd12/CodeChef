import java.util.Scanner;

public class AreaorPerimeter {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x, y;
		x = obj.nextInt();
		y = obj.nextInt();
		obj.close();
		checkAnd(x,y);

	}

	private static void checkAnd(int x, int y) {
		int area = 0, per = 0;
		area = x*y;
		per = 2*(x+y);
		if(area>per)
			System.out.println("Area " +"\n"+ area);
		else if(per>area)
			System.out.println("Peri" + "\n" +per);
		else
			System.out.println("Eq"+"\n" + area);
	}

}
