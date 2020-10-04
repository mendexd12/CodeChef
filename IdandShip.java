import java.util.Scanner;

public class IdandShip{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test = obj.nextInt();
		for(int i=0;i<test;i++) {
			String c = obj.next();
			if(c.contains("B")||c.contains("b"))
				System.out.println("BattleShip");
			else if(c.contains("C")||c.contains("c"))
				System.out.println("Cruiser");
			else if(c.contains("D")||c.contains("d"))
				System.out.println("Destroyer");
			else if(c.contains("F")||c.contains("f"))
				System.out.println("Frigate");
			else
				break;
			
		}
	}
}