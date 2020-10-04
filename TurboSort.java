import java.util.Arrays;
import java.util.Scanner;


public class TurboSort{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int x;
		x = obj.nextInt();
		int[] values = new int[x];
		for(int i=0;i<x;i++) {
			values[i] = obj.nextInt();
		}
		Arrays.sort(values);
		for(int y:values) {
			System.out.println(y);
		}
	}
}
