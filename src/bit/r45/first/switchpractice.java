package bit.r45.first;
import java.util.Scanner;
public class switchpractice {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 입니다.");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 입니다.");
			break;
		default:
			System.out.println("바보 멍청이");
			
		}
		
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		

	}

}
