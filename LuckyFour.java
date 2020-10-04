import java.util.Scanner;

public class LuckyFour {
	public static void main(String[] args) throws java.lang.Exception {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		try {
			int n, x, count = 0,y;
			n = obj.nextInt();
			for(int i =0;i<n;i++) {
				x = obj.nextInt();
					while(x!=0) {
						y = x%10;
						if(y ==  4) 
							count++;
							x = x/10;						
				}
				System.out.println(count);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
