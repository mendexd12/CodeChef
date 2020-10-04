import java.util.Scanner;

public class Lapindromes{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			StringBuilder str = new StringBuilder();
			String st = obj.nextLine();
			str.append(st);
			str = str.reverse();
			if(st.equals(str)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
		}
	}
}