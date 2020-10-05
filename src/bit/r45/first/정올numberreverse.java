package bit.r45.first;
import java.util.Scanner;
public class 정올numberreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, attempts, sum;
		
		attempts = 1;
				
		num = sc.nextInt();
	
		while(attempts <= 9) {
			num = sc.nextInt();
			attempts += 1;
						
			
			
			if(num == 0) {
				System.out.println("종료!");
				break;
			}
		}
		
	}

}
