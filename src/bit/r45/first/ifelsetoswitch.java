package bit.r45.first;

import java.util.Scanner;

public class ifelsetoswitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int code = scanner.nextInt();
				
//		if(code == 1) {
//			System.out.println("R101호 입니다.");
//		} else if(code == 2) {
//			System.out.println("R202호 입니다.");
//		} else if(code == 3) {
//			System.out.println("R303호 입니다.");
//		} else if(code == 4) {
//			System.out.println("R404호 입니다.");
//		} else {
//			System.out.println("상담원에게 문의하세요.");
//		}
        switch(code) {
        case 1:
        	System.out.println("R101호로 가세요");
        	break;
        case 2:
        	System.out.println("R202호로 가세요");
        	break;
        case 3:
        	System.out.println("R303호로 가세요");
        	break;
        case 4:
        	System.out.println("R404호로 가세요");
        	break;
        default:
        	System.out.println("상담원에게 문의하세요.");
        }
	}

}

