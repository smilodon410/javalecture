package bit.r45.first;
import java.util.Scanner;

public class 정올더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, attempts, sum;
		
		attempts = 1;
		sum = 0;
				
		while(attempts <= 9) {
			num = sc.nextInt();
			attempts += 1;
			
			
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			System.out.println(sum);
						
						
			
			}
		}
		
	}

