package bit.r45.first;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str = "안녕하세요.";
		System.out.println(str + ":" + num);

	}

}
