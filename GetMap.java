import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetMap {

	@SuppressWarnings({ "rawtypes", "resource", "unused" })
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner obj = new Scanner(System.in);
		int test_cases = obj.nextInt();
		for(int i=0;i<test_cases;i++) {
			Integer x = obj.nextInt(); 
			String str = obj.nextLine();
			map.put(x, str);
		}
		
		for(Map.Entry values:map.entrySet()) {
			System.out.println(values.getKey()+" "+values.getValue());
		}
		
	}
}
