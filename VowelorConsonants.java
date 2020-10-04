import java.util.Scanner;

public class VowelorConsonants {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		char str = obj.next().charAt(0);
		obj.close();
		if((str == 'A')||(str == 'E')||(str == 'I')||(str == 'O')||(str == 'U')){
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
