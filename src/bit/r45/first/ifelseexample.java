package bit.r45.first;

import java.util.Scanner;

public class ifelseexample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int code = scanner.nextInt();
				
		if(code == 1) {
			System.out.println("R101호 입니다.");
		} else if(code == 2) {
			System.out.println("R202호 입니다.");
		} else if(code == 3) {
			System.out.println("R303호 입니다.");
		} else if(code == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}

	}

}
