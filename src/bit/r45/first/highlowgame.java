package bit.r45.first;
import java.util.Scanner;
public class highlowgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = (int)(Math.random()*100);
		int num;
		
		System.out.println("숫자를 입력해주세요 : ");
		
		num = 0;
		
		while(num != i) {
			num = sc.nextInt();
			if(num < i) {
				System.out.println("더 큰 숫자를 입력해 주세요 :");
			} else if(num > i) {
				System.out.println("더 작은 숫자를 입력해 주세요 :");
			}
			
		}
		
		System.out.println("정답!");
		
		

	}

}
