import java.util.*;

public class AnswertoLife{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int n = 0;
		n = obj.nextInt();
		while(n!=42) {
			System.out.println(n);
			n = obj.nextInt();
		}
	}
}