package bit.r45.first;
import java.util.Scanner;
public class switchpractice2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
//		boolean leaf = isleafyear(year);
		
		if(year/4 == 0) {
			System.out.println(year + "년은 윤년!");
		} else {
			System.out.println(year + "년운 평년!");
		}

	}
	
//	public static boolean isleafyear(int year) {
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
