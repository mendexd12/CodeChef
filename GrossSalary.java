import java.util.Scanner;

public class GrossSalary{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int base_Salary = 0, test_cases;
		test_cases = obj.nextInt();
		double hra, da; 
		double gs;
		for(int i=0;i<test_cases;i++) {
			base_Salary = obj.nextInt();
			if(base_Salary>=1500) {
				hra = 500;
				da = 0.98 * base_Salary;
			}
			else {
				hra = 0.10 * base_Salary;
				da = 0.90 * base_Salary;
			}
			gs = base_Salary + hra + da;
			System.out.println(gs);
		}
	}
}