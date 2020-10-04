import java.util.Scanner;

public class Mahasena {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int even = 0, odd = 0;
		int[] values = new int[x];
		for(int i=0;i<x;i++) {
			values[i] = obj.nextInt();
		}
		for(int i=0;i<x;i++) {
			if(values[i]%2==0) {
				even++;
			}else{
				odd++;
			}
		}

		if(even>odd)
			System.out.println("READY FOR BATTLE");
		else
			System.out.println("NOT READY");
	}

}
