package bit.r45.first;
import java.util.Scanner;
public class forpractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		
		System.out.println("단을 입력해주세요.");
		System.out.println("단:");
		
		dan = sc.nextInt();
		
		for(; i <= 9; i++ ) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		

	}

}
