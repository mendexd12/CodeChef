import java.util.Scanner;

public class WhatsInName {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		String str[] = obj.nextLine().split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i].substring(0,1).toUpperCase());
		}

	}

}
